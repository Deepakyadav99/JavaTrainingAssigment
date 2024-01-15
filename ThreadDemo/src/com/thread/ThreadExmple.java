package com.thread;

public class ThreadExmple extends Thread {
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			ThreadExmple t1=new ThreadExmple();  
		t1.start();  
		 }  
		}  