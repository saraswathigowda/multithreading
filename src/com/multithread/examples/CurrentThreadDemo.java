package com.multithread.examples;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread: " + t);
		
		// change the name of the thread
		t.setName("My Thread(Gani)");
		System.out.println("After changing name: " + t);

		try{
			for(int i = 5; i > 0; i--){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main thread intrrupted");
		}
	}

}
