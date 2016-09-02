package com.multithread.examples;

 class NewThread implements Runnable {
	Thread t;
	
	 NewThread() {
		// TODO Auto-generated constructor stub
		t = new Thread(this, "Demo thread");
		System.out.println("Child Thread" + t);
		t.start(); //start the thread
	}
	
	//This is the entry point for the second thread.
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Child thread: " +i);
				Thread.sleep(500);
			}
	}	
		catch(InterruptedException e){
			System.out.println("Child intrrupted.");
		}
	System.out.println("Exiting child thread.");
	}
}

class ThreadDemo{
	public static void main(String args[]){
		new NewThread();
		
		try{
		for(int i = 5; i > 0; i--){
			System.out.println("Main thread: " + i);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e){
			System.out.println("Main thread intrrupted.");
		}
		System.out.println("Main thread exiting");
		
	}
}
