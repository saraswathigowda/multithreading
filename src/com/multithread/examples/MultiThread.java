package com.multithread.examples;

class NewThread1 implements Runnable{
	String name;
	Thread t;
	
	public NewThread1(String threadName) {
		// TODO Auto-generated constructor stub
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i = 5; i > 0; i--){
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
			}
		catch(InterruptedException e){
			System.out.println(name + "Intrrupted");
		}
		System.out.println(name + " exiting");
	}
}
 class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread1("One");
		new NewThread1("Two");
		new NewThread1("Three");
		
		try{
				Thread.sleep(10000);
			}
			catch(InterruptedException e){
				System.out.println("Main thread intrrupted.");
			}
			System.out.println("Main thread exiting");
	}
}
