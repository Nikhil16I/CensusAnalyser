package com.censu_analyser.analyser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.census_analyser.entity.CensusData;
import com.opencsv.CSVReader;

public class StateCensusAnalyser {

	List<CensusData> censusData = new ArrayList<>();//Storing Data in list
	
/*Method to load CSV data*/
	public void loadCensusData(String filePath) throws Exception {
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
