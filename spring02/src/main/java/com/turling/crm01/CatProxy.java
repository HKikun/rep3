package com.turling.crm01;
/**
 * 代理
 * @author hk
 *
 */
public class CatProxy implements CatInterface {
	private CatInterface catinterface;
	
	public CatProxy(CatInterface catInterface) {
		super();
		//System.out.println(this.catinterface);
		this.catinterface=catInterface;
		//System.out.println(this.catinterface);
		//这个接口如何完成赋值
	}

	@Override
	public void eat() {
		
	}

	@Override
	public void sleep() {
		System.out.println("睡前故事");
		catinterface.sleep();
		System.out.println("已经休息了");
	}

}
