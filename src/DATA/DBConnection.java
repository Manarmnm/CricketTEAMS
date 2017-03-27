/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MASS MNM
 */
public class DBConnection {
       
         public Connection getConnection() {
		
              Connection con = null;

		String dbhost = "jdbc:mysql://localhost:3306/teamselectiondb";
		String user = "root";
		String password = "mnm123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbhost, user, password);
		} catch (Exception e) {
			System.err.println("error in connection");
			e.printStackTrace();
		}
		// System.out.println("======Connection Successfully======");
		return con;
	}
        
         
           public static void main(String[] args) {
		new DBConnection().getConnection();
	}
}
