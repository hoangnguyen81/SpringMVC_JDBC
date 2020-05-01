package com.laptrinhjavaweb.repository.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;
import com.laptrinhjavaweb.repository.ISimpleJpaRepository;

public class SimpleJpaRepository<T> implements ISimpleJpaRepository<T> {
	// JDBC driver and Database URL
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/estate32020modulepart1";
	// Database credentials
	final String USER = "root";
	final String PASS = "HLTCa4fc48080197@#@";
	List<T> result = new ArrayList<T>();
	Object object = new Object();
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		try {
			// Step 2 Register JDBC driver
			Class.forName(JDBC_DRIVER);
			// Step 3 Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database successfull...");
			// Step 4 Execute a query
			System.out.println("Creating a statement...");
			stmt = conn.createStatement();
			String tableName = "";
			if (tClass.isAnnotationPresent(Table.class)) {
				Table table = tClass.getAnnotation(Table.class);
				tableName = table.name();
			}

			String sql = "select * from " + tableName;
			rs = stmt.executeQuery(sql);
			if (tClass.isAnnotationPresent(Entity.class)) {
				ResultSetMetaData resultSetMetaData = rs.getMetaData();
				Field[] fields = tClass.getDeclaredFields();
				while (rs.next()) {
					T object = tClass.newInstance();
					for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
						String columnName = resultSetMetaData.getColumnName(i + 1);
						Object columnValue = rs.getObject(i + 1);
						for (Field field : fields) {
							if (field.isAnnotationPresent(Column.class)) {
								Column column = field.getAnnotation(Column.class);
								if (column.name().equals(columnName) && columnValue != null) {
									BeanUtils.setProperty(object, field.getName(), columnValue);
								}
							}
						}
					}
					result.add(object);
				}
			}
		} catch (SQLException se) {
			// Handle SqlExeption
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object findId(long id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		try {
			// Step 2 Register JDBC driver
			Class.forName(JDBC_DRIVER);
			// Step 3 Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database successfull...");
			// Step 4 Execute a query
			System.out.println("Creating a statement...");
			stmt = conn.createStatement();
			String tableName = "";
			String idTemp = String.valueOf(id);
			if (tClass.isAnnotationPresent(Table.class)) {
				Table table = tClass.getAnnotation(Table.class);
				tableName = table.name();
			}

			String sql = "select * from " + tableName + " where id = " + idTemp;
			rs = stmt.executeQuery(sql);
			if (tClass.isAnnotationPresent(Entity.class)) {
				ResultSetMetaData resultSetMetaData = rs.getMetaData();
				Field[] fields = tClass.getDeclaredFields();
				while (rs.next()) {
					T objectTemp = tClass.newInstance();
					for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
						String columnName = resultSetMetaData.getColumnName(i + 1);
						Object columnValue = rs.getObject(i + 1);
						for (Field field : fields) {
							if (field.isAnnotationPresent(Column.class)) {
								Column column = field.getAnnotation(Column.class);
								if (column.name().equals(columnName) && columnValue != null) {
									BeanUtils.setProperty(objectTemp, field.getName(), columnValue);
									break;
								}
							}
						}
					}
					//result.add(object);
					object = objectTemp;
				}
			}
		} catch (SQLException se) {
			// Handle SqlExeption
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return object;
	}
}
