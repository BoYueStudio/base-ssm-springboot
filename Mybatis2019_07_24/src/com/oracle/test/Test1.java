package com.oracle.test;

public class Test1 {
//	�߳���ҵ��:
//	     ��3���̣߳�һ��һֱ��ӡ��ĸa,һ��һֱ��ӡ��ĸb,һ��һֱ��ӡ��ĸc��
//	     ������ʵ�����´�ӡЧ��abcabcabcabc����δ���ʵ��?
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
