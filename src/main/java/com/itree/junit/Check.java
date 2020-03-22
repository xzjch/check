package com.itree.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Check {

	public void equal(int a)
	{
		switch (a) {
		case 1:
			System.out.println("小");
		case 2:
			System.out.println("大");
		}
	}

	@RequestMapping("/say")
	@Controller
	class testClass
	{
		@RequestMapping("/sayHello")
		public String sayHello() {
			return "hello";
		}

	}
	@RequestMapping("/say")
	@Controller
	class testClass01
	{
		@RequestMapping("/sayHello")
		public String sayHello() {
			return "hello";
		}

	}
	@RequestMapping("/say")
	@Controller
	class testClass02
	{
		@RequestMapping("/sayHello")
		public String sayHello() {
			return "hello";
		}

	}
	@RequestMapping("/say")
	@Controller
	class testClass03
	{
		@RequestMapping("/sayHello")
		public String sayHello() {
			return "hello";
		}

	}
	@RequestMapping("/say")
	@Controller
	class testClass04
	{
		@RequestMapping("/sayHello")
		public String sayHello() {
			return "hello";
		}

	}

	public void cycle(int b) 
	{
		if (b < 20)
		{
			System.out.print("小于20");
		}
	}

	public void time() 
	{
		String dat = "02/17/2018";
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			df.parse(dat);
			System.out.print("valid");
		} catch (ParseException e) {
			System.out.print("invalid");
		}

	}
	
	public void time01() 
	{
		String dat = "02/17/2018";
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			df.parse(dat);
			System.out.print("valid");
		} catch (ParseException e) {
			System.out.print("invalid");
		}

	}


}
