package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	static Connection conn = null;
	
		public static void main(String[] args) {
		
			Logger log = LoggerFactory.getLogger(Main.class);
			
			String url = "jdbc:postgresql://localhost:5432/dbIntro?useSSL=false";
			String username = "postgres";
			String password = "1234";
			
			try {
				log.info("connessione al database");

				conn = DriverManager.getConnection(url, username, password);
				log.info("Connesso");
			} catch (Exception e) {
				log.error("error: " + e.getMessage());		
			}
			
			HashMap <String, Object> prova = new HashMap<>();
			prova.put("name", "andrea");
			prova.put("lastname", "rossi");
			prova.put("gender", "M");
			prova.put("avg", 10);
			prova.put("min_vote", 12);
			prova.put("max_vote", 12);
			//insertStudent("andrea", "Rossi", "M", 5, 1, 10);
			//insertStudent("Marianna", "Rossi", "F", 5, 1, 10);
			//insertStudent("Emanuele", "Rossi", "M", 5, 1, 10);
			//deleteStudent(6);
			getBest();
			getVoteRange(5,10);
			updateStudent(2, prova);
		}

		public static void updateStudent(int id, HashMap<String, Object> s) {
				Logger log = LoggerFactory.getLogger(Main.class);
				
				String sqlUpdateOne = "UPDATE school_students SET name=?, lastname=?, gender=?, avg=?, min_vote=?, max_vote=? WHERE id = ?";
				try {
					PreparedStatement stmtUpdateOne = conn.prepareStatement(sqlUpdateOne);
					stmtUpdateOne.setObject(1, s.get("name"));
					stmtUpdateOne.setObject(2, s.get("lastname"));
					stmtUpdateOne.setObject(3, s.get("gender"));
					stmtUpdateOne.setObject(4, s.get("avg"));
					stmtUpdateOne.setObject(5, s.get("min_vote"));
					stmtUpdateOne.setObject(6, s.get("max_vote"));
					stmtUpdateOne.setInt(7, id);
					stmtUpdateOne.execute();
					log.info("Studente modificato!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		public static void insertStudent(String name, String lastname, String gender, int avg, int min_vote, int max_vote) {
			Logger log = LoggerFactory.getLogger(Main.class);
			
			String sqlInsert = "INSERT INTO school_students (name ,lastname, gender, avg, min_vote, max_vote) VALUES(?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement stmt = conn.prepareStatement(sqlInsert);
				stmt.setString(1, name);
				stmt.setString(2, lastname);
				stmt.setString(3, gender);
				stmt.setInt(4, avg);
				stmt.setInt(5, min_vote);
				stmt.setInt(6, max_vote);
				stmt.execute();
				log.info("Studente inserito!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void deleteStudent(int id) {		
			Logger log = LoggerFactory.getLogger(Main.class);
			
			String sqlDeleteOne = "DELETE FROM school_students WHERE id = ?";
			try {
				PreparedStatement stmtDeleteOne = conn.prepareStatement(sqlDeleteOne);
				stmtDeleteOne.setInt(1, id);
				stmtDeleteOne.execute();
				log.info("Studente eliminato!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void getBest() {
			Logger log = LoggerFactory.getLogger(Main.class);
			
			String sqlSelect = "SELECT MAX(avg) AS avg FROM school_students";
			try {
				Statement stmt = conn.createStatement();
				ResultSet best = stmt.executeQuery(sqlSelect);
				while (best.next()) {
					log.info("AVG: " + best.getInt("avg"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void getVoteRange(int min, int max) {
			Logger log = LoggerFactory.getLogger(Main.class);
			
			String sqlSelect = "SELECT * FROM school_students WHERE min_vote >= ? AND max_vote <= ?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sqlSelect);
				pstmt.setInt(1, min);
				pstmt.setInt(2, max);
				ResultSet result = pstmt.executeQuery();
				
				while (result.next()) {
					log.info("Name: " + result.getString("name") 
					+ ", Lastname: " + result.getString("lastname") 
					+ ", ID: " + result.getInt("id") 
					+ ", Gender: " + result.getString("gender")
					+ ", AVG: " + result.getInt("avg")
					+ ", Min Vote: " + result.getInt("min_vote")
					+ ", Max Vote: " + result.getInt("max_vote"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}