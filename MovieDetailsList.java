package com.cg.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class MovieDetailsList {
	ArrayList<MovieDetails> al; 

	public MovieDetailsList()
	{
		al= new ArrayList<MovieDetails>();
	}

	public void add_movie(MovieDetails aa) {
		al.add(aa);
		
	}


	public ArrayList<MovieDetails> getAllDetails() {
		return al;
	}
	public void remove_movie() {

	}

	public void remove_Allmovies() {

	}

	public void find_movie_By_mov_Name() {

	}

	public void find_movie_By_Genre() {

	}

}
