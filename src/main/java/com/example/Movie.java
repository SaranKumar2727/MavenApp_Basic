package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data //@setter @getter @ToString @Hashcode @Equals
public class Movie {
	private int id;
	private String title;
	private String genre;
	private int boxOffice;
	private String director;
	private int runTime;
	private String actor;
	

}
