package com.census_analyser.entity;

public class CensusData {

	String state;
	long population;

	int areainSqKm;
	double densityperSqKm;

//Constructor for CSV data Format
	public CensusData(String state, long population, int areainsqkm, double densityperSqKm) {
		super();
		this.state = state;
		this.population = population;
		this.areainSqKm = areainsqkm;
		this.densityperSqKm = densityperSqKm;
	}
}
