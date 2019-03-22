package com.richy.cprogramming.runables;

public class SleepThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			if(i%10==0) {
				System.out.println("-----------------"+i);
			}
			System.out.print(i);
			 try {
				Thread.sleep(1);
				System.out.print("    线程睡眠1毫秒！\n"); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
             
		}
	}
	
	public static void main(String[] args) {
		new Thread(new SleepThread()).start();
	}

}
