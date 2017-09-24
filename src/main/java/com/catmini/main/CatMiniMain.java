package com.catmini.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.catmini.dao.CatMiniDataConnectionImpl;

public class CatMiniMain {
	
	private static ApplicationContext applicationContext;
	private static Scanner scanner;
	private static CatMiniDataConnectionImpl catMiniDataConnectionImpl;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String environment = scanner.nextLine();
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		if(environment.equals("dev")) {
			catMiniDataConnectionImpl = (CatMiniDataConnectionImpl)applicationContext.getBean("catMIniDataConnectionImplDev");
			catMiniDataConnectionImpl.doGetAccountCount(catMiniDataConnectionImpl.getJdbcTemplate());
		} else if(environment.equals("qaa")) {
			catMiniDataConnectionImpl = (CatMiniDataConnectionImpl)applicationContext.getBean("catMIniDataConnectionImplQaa");
			catMiniDataConnectionImpl.doGetAccountCount(catMiniDataConnectionImpl.getJdbcTemplate());
			catMiniDataConnectionImpl.doGetAccountCountGroupByAccountType(catMiniDataConnectionImpl.getJdbcTemplate());
		}
	}
}