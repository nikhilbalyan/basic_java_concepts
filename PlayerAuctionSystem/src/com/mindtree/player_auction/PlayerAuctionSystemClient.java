package com.mindtree.player_auction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PlayerAuctionSystemClient {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add a Player");
			System.out.println("2. Display a Player");
			System.out.println("3. Exit");

			int t = sc.nextInt();

			if (t == 1) {
				PlayerAuctionSystemManager player = new PlayerAuctionSystemManager();
				String playerName, category, bestFigure, teamName;
				int highestScore;
				System.out.print("enter player name:");
				playerName = sc.next();
				System.out.println();
				System.out.print("enter category:");
				category = sc.next();
				System.out.println();
				System.out.println("enter highest Score:");
				highestScore = sc.nextInt();
				System.out.println();
				System.out.println("enter team name:");
				teamName = sc.next();
				System.out.println("enter best figure");
				bestFigure = sc.next();
				System.out.println();
				player.addPlayer(playerName, category, highestScore, teamName,
						bestFigure);
			}
			if (t == 2) {
				PlayerAuctionSystemManager player1 = new PlayerAuctionSystemManager();
				System.out.print("enter team name");
				String teamName;
				teamName = sc.next();
				System.out.println();
				player1.displayPlayer(teamName);
			} else {
				break;
			}
		}
		sc.close();
	}
}
