package com.richy.cprogramming.runables;

public class JoinThread implements Runnable{
	private String name;
	
	public JoinThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Thread--"+name+" "+i);
		}
	}
	
	/**
	 * @descrp：在main方法执行的过程中，使用t2.join，也就是mian线程放弃cpu的执行权
	 * 然后等待t2.执行完成后再执行main线程，也就是调用t1线程执行，所以打印出来的效果是
	 * t2执行完成后，执行t1，线程之间本来并行执行变成了串行执行
	 * 	注意：
	 * 		join方法必须在star()方法之后调用才有意义，这个好理解，如果方法都没有启动，调用join有什么意义呢？
	 * 
	 * @author：FyRichy
	 * @time：2019年3月22日下午4:09:45
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		JoinThread jt1 = new JoinThread("jt1");
		JoinThread jt2 = new JoinThread("jt2");
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);
		t2.start();
		t2.join();
		t1.start();
	}

}
