package com.laptrinhjavaweb.repository.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.ISimpleJpaRepository;

public class SimpleJpaRepository<T> implements ISimpleJpaRepository<T> {
	// JDBC driver and Database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/estate32020modulepart1";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "1234";
	@SuppressWarnings("unchecked")
	Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	List<T> result = new ArrayList<T>();
	Object object = new Object();

	protected Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database successfull...");
			return conn;
		} catch (SQLException se) {
			return null;
		} catch (Exception e) {
			return null;
		}

	}

	public List<T> findAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database successfull...");
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
			se.printStackTrace();
		} catch (Exception e) {
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

	@Override
	public Object findId(long id) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database successfull...");
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
					// result.add(object);
					object = objectTemp;
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
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

	@Override
	public void insert(Object object) {
		String sql = buildSqlinsert();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = this.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.prepareStatement(sql);
			Class<?> aClass = object.getClass();
			int index = 1;
			for (Field field : aClass.getDeclaredFields()) {
				field.setAccessible(true);
				stmt.setObject(index, field.get(object));
				index++;
			}
			stmt.executeUpdate();
			conn.commit();
			System.out.println("Inserted successfull...");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	private String buildSqlinsert() {
		String tableName = "";
		if (tClass.isAnnotationPresent(Table.class)) {
			Table table = tClass.getAnnotation(Table.class);
			tableName = table.name();
		}
		StringBuilder fields = new StringBuilder("");
		StringBuilder params = new StringBuilder("");
		for (Field field : tClass.getDeclaredFields()) {
			if (fields.length() > 1) {
				fields.append(",");
				params.append(",");
			}
			if (field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				fields.append(column.name());
				params.append("?");
			}
		}
		String sql = "INSERT INTO " + tableName + "(" + fields.toString() + ") VALUES(" + params.toString() + ")";
		return sql;
	}

	@Override
	public void deleteById(Long id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String tableName = "";
		if (tClass.isAnnotationPresent(Table.class)) {
			Table table = tClass.getAnnotation(Table.class);
			tableName = table.name();
		}
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			stmt = conn.prepareStatement("delete from " + tableName + " where id=?");
			stmt.setLong(1, id);
			stmt.executeUpdate();
			conn.commit();
			System.out.println("Deleted successfull...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void deleteByCondition(String sql) {
		Connection conn = null;
		Statement stmt = null;
		if (sql.contains("DELETE") == false && sql.contains("delete") == false) {
			System.out.println("Not delete sql");
			return;
		}
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			stmt.execute(sql);
			conn.commit();
			System.out.println("Delete successfull...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void Update(Object object) {
		String sql = buildSqlUpdate();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = this.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.prepareStatement(sql);
			Class<?> aClass = object.getClass();
			int index = 1;
			for (Field field : aClass.getDeclaredFields()) {
				field.setAccessible(true);
				stmt.setObject(index, field.get(object));
				index++;
			}
			stmt.executeUpdate();
			conn.commit();
			System.out.println("Update successfull...");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	private String buildSqlUpdate() {
		String tableName = "";
		if (tClass.isAnnotationPresent(Table.class)) {
			Table table = tClass.getAnnotation(Table.class);
			tableName = table.name();
		}
		StringBuilder fields = new StringBuilder("");
		StringBuilder idTemp = new StringBuilder("");
		for (Field field : tClass.getDeclaredFields()) {
			if (field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				if (!column.name().equals("id")) {
					fields.append(column.name()).append("=?,");
				} else {
					idTemp.append(column.name());
				}
			}
		}
		fields.deleteCharAt(fields.length() - 1); // Delete the last "," in the fields: name=?,ward=?;
		String sql = "UPDATE " + tableName + " SET " + fields.toString() + " WHERE id=?";
		return sql;
	}
}
