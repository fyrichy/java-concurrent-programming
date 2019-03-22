package com.richy.cprogramming.runables;

public class TestDoSomething {

	public static void main(String[] args) {
		DoSomething ds1 = new DoSomething("ds1");
		DoSomething ds2 = new DoSomething("ds2");
		new Thread(ds1).start();
		new Thread(ds2).start();
	}
}
