package com.ey.movie;

public class Movie {
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
	public Movie() {
		
	}

	public Movie(int movieId, int noOfTickets, double discount, double totalAmount) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
		this.discount = discount;
		this.totalAmount = totalAmount;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", noOfTickets=" + noOfTickets + ", discount=" + discount
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
	
	
}
