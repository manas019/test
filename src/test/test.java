package test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
public class test {

	
	
	public static void main(String [] args)
	{
		int i;
		Scanner sc= new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println((countWords(word)));
		String[] splited = word.trim().split("\\s+");
		for (int j=0;j<splited.length;j++){
			System.out.println(splited[j]);
		}
	String[] x=Lexcographsort(splited);
	for (int j=0;j<x.length;j++){
		System.out.println(x[j]);
	}
	
	StringBuilder builder = new StringBuilder();

	for (String string : x) {
	    if (builder.length() > 0) {
	        builder.append(" ");
	    }
	    builder.append(string);
	}

	String string = builder.toString();
	System.out.println(string);
		
	}
	public static int countWords(String s){

	    int wordCount = 0;

	    boolean word = false;
	    int endOfLine = s.length() - 1;

	    for (int i = 0; i < s.length(); i++) {
	       
	        if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
	            word = true;
	           
	        } else if (!Character.isLetter(s.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	           
	        } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    return wordCount;
	   
	}
	
	public static String[] Lexcographsort(String [] s){
		String temp;
		for(int j=0;j<s.length;j++)
			for(int k=j+1;k<s.length;k++)
				 if(s[j].compareTo(s[k])>0){  
					 temp = s[j];
	                    s[j] = s[k];
	                    s[k] = temp;

                    
             }  
		
		return  s;
	}
	
	
}
