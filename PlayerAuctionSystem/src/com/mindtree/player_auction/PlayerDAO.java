package com.mindtree.player_auction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerDAO {

	public void addPlayer(String playerName, String category, int highestScore,
			String teamName, String bestFigure) throws SQLException {
		try {
			Connection con = JDBCMySQLConnection.getConnection();
			String query = " INSERT INTO player(Player_Name, Category, HighestScore, BestFigure)"+ 
					" values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, playerName);
			ps.setString(2, category);
			ps.setInt(3, highestScore);
			ps.setString(4, bestFigure);
			ps.execute();
			
			int teamId; 
			String queryTeamId = " Select Team_Id from Team WHERE Team_Name= "+ teamName;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(queryTeamId);
			while(rs.next()) {
				teamId = rs.getInt("team_ID");
				System.out.println("here is the retrieved team id = "+teamId);
			}
			
			/*Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TEAM");
			
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2));

			}
			con.close();
*/			// System.out.println(demo);
			con.close();
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("catch exception "+e.getMessage());
		}
		
	}

}
