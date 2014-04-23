/**
 * 
 */
package com.biotech.inudstries.web.services.database;

import java.sql.PreparedStatement;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public enum QueryFormats {

	/**
	 * Takes three parameters and returns a string that can be used to generate
	 * a {@link PreparedStatement} with one argument, the value in the column to
	 * select rows by.
	 * 
	 * @Param DatabaseName Name of the database to select from
	 * @Param TableName Name of the table to select from
	 * @Param ColumnName Name of the column to look for a value in
	 */
	SELECT_ROW_BY_COLUMN("SELECT * FROM %1$s.%2$s WHERE %3$s= ?"),

	/**
	 * Takes four parameters and returns a string that can be used to generate a
	 * {@link PreparedStatement} with two arguments, the values of columns
	 * specified by the third and fourth parameter to select rows by.
	 * 
	 * @Param DatabaseName Name of the database to select from
	 * @Param TableName Name of the table to select from
	 * @Param ColumnName Name of the column to look for a value in
	 * @Param ColumnName Name of the column to look for a value in
	 */
	SELECT_ROW_BY_TWO_COLUMN("SELECT * FROM %1$s.%2$s WHERE %3$s= ? AND %4$s= ?");

	private final String query;

	/**
	 * 
	 */
	private QueryFormats(String query) {
		this.query = query;
	}

	public String build(Object... args) {
		return String.format(query, args);
	}
}
