package project_jenkinstraining.jenkinstest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JenkinsDemo {
	
	@Test
	public void addToCart(){
		System.out.println("Add to shopping cart");
	}
	
	@Before
	public void login(){
		System.out.println("Login Window of web");
	}
	
	@After
	public void logout(){
		System.out.println("logout Window of Web");
	}

}
