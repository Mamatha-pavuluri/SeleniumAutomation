package com.basics;

import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Sample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Selenium selenium=new DefaultSelenium("localhost",4444,"*Chrome","http://gmail.com");
				
				
				selenium.start();
				selenium.open("/");
				selenium.windowMaximize();
				//selenium.type("", "");
	}

}
