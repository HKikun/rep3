package com.turling.crm03;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
	private Object WorkService;
	public ProxyFactory(Object worObject){
		super();
		this.WorkService=worObject;
	}
	
	public Object getProxy() {
		Enhancer en=new Enhancer();
		en.setClassLoader(WorkService.getClass().getClassLoader());
		en.setSuperclass(WorkService.getClass());
		en.setCallback(this);
		return en.create();
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object arg=null;
		if(!method.getName().equals("select")) {
			System.out.println("开启事务");
			arg=method.invoke(WorkService, args);
			System.out.println("提交事务");
		}else {
			arg=method.invoke(WorkService, args);
		}
		return arg;
	}

}
