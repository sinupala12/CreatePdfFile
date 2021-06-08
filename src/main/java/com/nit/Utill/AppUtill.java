package com.nit.Utill;

import java.util.Scanner;

public interface AppUtill {

	public static String DisplayName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Employee Id ");
		Integer id=sc.nextInt();
		System.out.println("enter a First Name");
		String FirstName=sc.next();
		System.out.println("enter a Last Name");
		String Lastname=sc.next();
		return FirstName.concat(Lastname)+"_"+id;
	}

}
