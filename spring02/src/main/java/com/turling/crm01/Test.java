package com.turling.crm01;

public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.sleep();
		System.out.println("===========");
		CatProxy catproxy=new CatProxy(cat);
		catproxy.sleep();
	}
}
