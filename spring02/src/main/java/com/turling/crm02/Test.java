package com.turling.crm02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat();
		CatInterface catinterface=(CatInterface) Proxy.newProxyInstance(
				cat.getClass().getClassLoader(),
				cat.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("睡前故事");
						Object obj = arg1.invoke(cat, args);
						System.out.println("休息了");
						return obj;
					}
				});
		catinterface.sleep();
	}
}
