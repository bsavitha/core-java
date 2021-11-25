package com.xworkz.crudoperation.crud;

public interface BankInterface {

	
	boolean saveBankData(BankDTO dto);

	BankDTO findIfsc(String ifsccode);

	void displayBankDetails();

}


