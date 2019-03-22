package com.richy.cprogramming.runables;

/**
 * @descrp：创建一个多线程，通过实现Runnable接口的方式
 * @author：FyRichy
 * @time：2019年3月22日上午11:46:43
 */
public class DoSomething implements Runnable{

	private String name;
	
	public DoSomething(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			for(int k=0;k<1000000;k++);
			System.out.println(name+" : "+i);
		}
	}

}
