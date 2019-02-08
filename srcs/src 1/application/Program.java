package application;

import java.sql.Connection;
//import com.mysql.jdbc.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

}
