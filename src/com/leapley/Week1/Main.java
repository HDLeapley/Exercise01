package com.leapley.Week1;

public class Main {
    /*
    Hudson Leapley 1/17/2019
    Write a program that stores a city name as a string, the city's
    zip code as an integer, and the high temperature for the next five
    days in an array. The program should calculate the average high
    temperature for the next five days and store the value in a variable.
    Finally, the program should display the city name, the zip code, and
    the average high temperature.
     */
    public static void main(String[] args) {
	    String cityName = "Columbus";
	    int zipCode = 43125;
	    int highTemperatures[]={32,25,27,40,45};
	    float avgTemp = 0;

	    for (int i=0;i<highTemperatures.length;i++){
            avgTemp+=highTemperatures[i]; //Find the sum of the high temperatures over the next 5 days.
        }
        avgTemp=avgTemp/highTemperatures.length; //Divide by 5 days to find the average high temperature

        System.out.println("City: " + cityName + " Zip Code: " + zipCode + " Average High Temperature: " + avgTemp + "F"); //Output
    }
}
