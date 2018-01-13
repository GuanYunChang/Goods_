/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Tools;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class sqltool {

	public static <T> List<T> query(String sql, Object[] args, RowMapper<T> rowMapper) throws DataAccessException        
	 {
	    return query(sql, args, (RowMapper<T>) new RowMapperResultSetExtractor<T>(rowMapper));
	}
}
