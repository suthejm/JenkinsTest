package com.suthej.MavenSelenium.JenkinsDemo;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class rTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Class cls=Test1.class;
		Method[] m=cls.getMethods();
		for(Method m1:cls.getDeclaredMethods())
		{
			Parameter[] p=m1.getParameters();
			System.out.println(p.length);
			for(Parameter p1:p)
			{
				System.out.println(p1.getName());
			}
		}
		
	}

}
