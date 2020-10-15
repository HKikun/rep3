package com.turling.crm03;

public class MainTest {

	public static void main(String[] args) {
		WorkService work=new WorkService();
		WorkService proxy=(WorkService)new ProxyFactory(work).getProxy();
		proxy.add();
		System.out.println("-------------");
		proxy.select();;
		System.out.println("-------------");
		proxy.delete();;
		System.out.println("-------------");
	}

}
