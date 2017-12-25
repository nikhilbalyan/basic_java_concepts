package com.mindtree.player_auction;

public class PlayerPOJO {
	int player_no;
	String player_name;
	String category;
	int highestScore;
	String bestScore;

	public int getPlayer_no() {
		return player_no;
	}

	public void setPlayer_no(int player_no) {
		this.player_no = player_no;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}

	public String getBestScore() {
		return bestScore;
	}

	public void setBestScore(String bestScore) {
		this.bestScore = bestScore;
	}

}
