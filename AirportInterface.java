package com.xworkz.crudoperation.crud;

public interface AirportInterface {
	boolean saveAirportData(AirportDTO dto);

	AirportDTO findLocation(String location);

	void displayAirportDetails();

}
