package com.censu_analyser.analyser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

import com.censu_analyser.entity.CensusData;

public class StateCensusAnalyser {

	List<CensusData> censusData = new ArrayList<>();
	
/*Method to load CSV data*/
	public void loadCensusData() throws Exception {
	try {                                                         /*CSV File Path*/             
    	CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Indian_State_Census_Analyser\\src\\com\\resources\\IndiaStateCensusData.csv"));
    	                                                     
		String[] csvdata;
		 csvdata = csvReader.readNext();
			while ((csvdata = csvReader.readNext()) != null) {
				censusData.add(new CensusData(csvdata[0], Long.parseLong(csvdata[1]), Integer.parseInt(csvdata[2]),
						Double.parseDouble(csvdata[3])));
	        }
			for (CensusData info : censusData) {
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public Object censusEntries() {
		if (censusData.size() == 29)
		return true;
		return false;
	}
}
