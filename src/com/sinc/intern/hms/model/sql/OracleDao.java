package com.sinc.intern.hms.model.sql;

import java.util.List;

public interface OracleDao {
	// CRUD
	// insert
	public int insertRow(Object obj);
	
	public int updateRow(Object obj);
	
	public int deleteRow(Object obj);
	
	// select
	// multiple select
	public List<Object> selectRow(); 
	
	// single select
	public Object selectRow(Object obj);
}
