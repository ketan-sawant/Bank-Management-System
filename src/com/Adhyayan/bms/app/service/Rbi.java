package com.Adhyayan.bms.app.service;
import java.io.IOException;

public interface Rbi {
	public void createAccount();
	public void displayAllDetails()throws IOException;
	public void depositeMoney();
	public void withdrawal();
	public void balanceCheck();

}

