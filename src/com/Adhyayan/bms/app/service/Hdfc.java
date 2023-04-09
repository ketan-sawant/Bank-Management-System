package com.Adhyayan.bms.app.service;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import com.Adhyayan.bms.app.model.*;

public class Hdfc implements Rbi {
	
	
	Account A = new Account();
	Scanner sc = new Scanner(System.in);
    
	@Override
	public void createAccount()
	{
	 System.out.println("Enter your Details");
	 System.out.println();
	 
	 System.out.println("Enter your Name");
	 A.setName(sc.nextLine());
	 System.out.println("Enter your AccountNo");
	 A.setAccNo(sc.nextLong());
	 
	 System.out.println("Enter your Mobile No.");
	 A.setMobNo(sc.next());
	 
	 System.out.println("Enter your Adhar No.");
	 A.setAdharNo(sc.next());
	 
	 System.out.println("Enter your Gender");
	 A.setGender(sc.next());
	 
	 System.out.println("Enter your Age");
	 A.setAge(sc.nextInt());
	 
	 System.out.println("Enter the amount which you want to deposite");
	 A.setBalance(sc.nextDouble());
	 
	}
	@Override
	public void displayAllDetails()
	{
		System.out.println("Your Details:-");
		
		System.out.println("acoount number:-"+A.getAccNo());
		System.out.println();
		System.out.println("Account Holder's Name:-"+A.getName());
		System.out.println();
		System.out.println("Mobile No. :-"+A.getMobNo());
		System.out.println();
		System.out.println("Adhar No. :-"+A.getAdharNo());
		System.out.println();
		System.out.println("Gender:-"+A.getGender());
		System.out.println();
		System.out.println("Age:-"+A.getAge());
		System.out.println();
		System.out.println("Account Balance:-"+A.getBalance());
		System.out.println("     *******      ");
		
		
		
	}
	@Override
	public void depositeMoney()
	{
		System.out.println("Enter the Amount You Want To Deposite:-");
		double Damt= sc.nextDouble();
		double Totalamt=A.getBalance()+Damt;
		A.setBalance(Totalamt);
		System.out.println("Your Account Balance Is:-");
		System.out.println((A.getBalance()));
	}
	@Override
	public void withdrawal()
	{
		System.out.println("Enter The Amount You Want To WithDraw:-");
		double Wamt= sc.nextDouble();
		double Totalamt = A.getBalance()-Wamt;
		A.setBalance(Totalamt);
		System.out.println("Your Account Balance Is:-");
		System.out.println((A.getBalance()));
		
	}
	@Override
	public void balanceCheck()
	{
		System.out.println(A.getBalance());
	}
}
