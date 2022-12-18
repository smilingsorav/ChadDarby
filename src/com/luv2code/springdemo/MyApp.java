package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach theCoach = new TrackCoach();
		//Coach theCoach2 = new BaseballCoach(null);
		//System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach2.getDailyWorkout());
		 //use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
