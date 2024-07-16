package com.ey.movie;

public class Movieservice {
	
	public static int calculateDiscount(int movieId, int noOfTickets) {
		int disc;
		if((movieId==101 || movieId==102 || movieId==10 ) && (noOfTickets<5)) {
			disc=0;
		}
		else if ((movieId==101 || movieId==103) && (noOfTickets>=5 && noOfTickets<10)) {
			disc=15;
		}
		else if ((movieId==101 || movieId==103) && (noOfTickets>=10 && noOfTickets<=15)) {
			disc=20;
		}
		else if ((movieId==102) && (noOfTickets>=5 && noOfTickets<10)) {
			disc=10;
			
		}
		else if ((movieId==102) && (noOfTickets>=10 && noOfTickets<=15)) {
			disc=15;
		}
		else {
			disc=0;
		}
		return disc;	
	}
	public static int getbasefare(int movieId) {
		int basefare;
		if(movieId==101) {
			basefare = 120;
		} 
		else if (movieId==102) {
			basefare=170;
		}
		else if (movieId==103) {
			basefare=150;
		}
		else {
			basefare=0;
		}
		
		return basefare;
		
	}
	public static double calculateTicketAmount(int movieId, int noOfTickets, int basefare) {
		double total;
		int disc=calculateDiscount(movieId, noOfTickets);
		total=(noOfTickets*basefare)-(basefare*noOfTickets*(disc/100));
		
		return total;
	}
	public void BookMyMovie(int movieId, int noOfTickets) {
		int basefare=getbasefare(movieId);
		double amo=calculateTicketAmount(movieId, noOfTickets, basefare);
		System.out.println("Total amount for booking " +amo);
	}
	
}
