package com.laptrinhjavaweb.repository;

import java.util.List;

public interface ISimpleJpaRepository<T> {
	List<T> findAll();
	Object  findId(long id);
}
