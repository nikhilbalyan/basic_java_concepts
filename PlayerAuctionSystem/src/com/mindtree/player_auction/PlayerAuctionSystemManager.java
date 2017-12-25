package com.mindtree.player_auction;

import java.sql.SQLException;

import com.mindtree.exceptions.InvalidCategoryException;
import com.mindtree.exceptions.NotABatsman;

public class PlayerAuctionSystemManager {

	public void addPlayer(String playerName, String category, int highestScore,
			String teamName, String bestFigure) throws SQLException {
		if (!category.equals("Batsman") || !category.equals("Bowler")
				|| !category.equals("Allrounder")) {
			InvalidCategoryException invalid = new InvalidCategoryException(
					"Invalid category name please check your input");
		}
		if (highestScore < 50 || highestScore > 200) {
			NotABatsman notABatsman = new NotABatsman(
					"Invalid Batsman Please check your input");
		}

		PlayerDAO playerDao = new PlayerDAO();
		playerDao.addPlayer(playerName, category, highestScore, teamName, bestFigure);
	}

	public void displayPlayer(String teamName) {
		// TODO Auto-generated method stub

	}
}
