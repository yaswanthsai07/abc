package com.ey.movie;

public class Movieapp {
	public static void main(String[] args) {
		Movieservice ms = new Movieservice();
		ms.BookMyMovie(101,5);
		ms.BookMyMovie(102, 4);
		ms.BookMyMovie(103, 8);
		
	}

}
