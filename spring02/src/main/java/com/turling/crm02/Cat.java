package com.turling.crm02;
/***
 * 目标方
 * @author hk
 *
 */
public class Cat implements CatInterface{

	@Override
	public void eat() {
		System.out.println("猫在吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println("猫在睡觉");
	}

}
