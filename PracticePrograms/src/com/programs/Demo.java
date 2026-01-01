package com.programs;

import java.util.Iterator;
import java.util.Scanner;

public class Demo 
{
	public static void upperCaseLetters(String s) 
	{
		String res1="";
		String res2="";
		String res3="";
		String res4="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)&& ch>='A'&&ch<='Z')
			{
				res1+=ch;
			}
			else if(Character.isAlphabetic(ch)&&ch>='a'&& ch<='z')
			{
				res2+=ch;
			}
			else if(Character.isDigit(ch))
			{
				res3+=ch;
			}
			else
			{
				res4+=ch;
			}
		}
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.next();
		upperCaseLetters(s);
	}
}
