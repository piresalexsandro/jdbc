package application;

import com.mysql.jdbc.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		java.sql.Connection conn = DB.getConnection();
		//Connection conn = (Connection) DB.getConnection();
		DB.closeConnection();
	}

}
