package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.censu_analyser.analyser.StateCensusAnalyser;
public class CensusAnalyserTest {

	/*Testing the CSV file to be Read*/
	@Test
	public void testcensus()throws Exception{
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		analyser.loadCensusData();
		assertEquals(true, analyser.censusEntries());

	}

}
