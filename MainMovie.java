package com.cg.collections;

public class MainMovie {

	public static void main(String[] args) {

MovieDetails m1= new MovieDetails("one","mahesh","df","thriller");
MovieDetails m2= new MovieDetails("Ar","vijay","fff","romance");
MovieDetails m3= new MovieDetails("BAN","mahesh","ddh","political");
MovieDetails m4= new MovieDetails("Bussinessman","rishi","da","political");
MovieDetailsList mdl=new MovieDetailsList();

	mdl.add_movie(m1);
	mdl.add_movie(m2);
	mdl.add_movie(m3);
	mdl.add_movie(m4);
	
	for(MovieDetails a:mdl.getAllDetails())
	{
		System.out.println(a);
	}
	
	}

}