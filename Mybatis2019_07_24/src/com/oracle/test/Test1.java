package com.oracle.test;

public class Test1 {
//	线程作业题:
//	     有3个线程，一个一直打印字母a,一个一直打印字母b,一个一直打印字母c，
//	     现在想实现以下打印效果abcabcabcabc，如何代码实现?
//	      
	public static void main(String[] args){
		Thread ta=new Thread(){
			@Override
			public void run() {
				System.out.print("a");
			}
		};
		Thread tb=new Thread(){
			@Override
			public void run() {
				System.out.print("b");
			}
		};
		
		Thread tc=new Thread(){
			@Override
			public void run() {
				System.out.print("c");
			}
		};
		
		
		ta.start();
		tb.start();
		tc.start();
	}
	
}
