package com.xworkz.crudoperation.crud;

public interface BusRouteInterface {
	boolean saveBusData(BusRouteDTO dto);

	BusRouteDTO findDriverName(String name);

	void displayBusDetails();
}
