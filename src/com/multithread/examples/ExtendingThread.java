package com.multithread.examples;

 class ExThread extends Thread {
	public ExThread() {
		// TODO Auto-generated constructor stub
		super("Demo Thread");
		System.out.println("Child thread: "+ this);
		start();
	}
	
	public void run(){
		try{
			for(int i = 5; i > 0; i--){
				System.out.println("Child thread: " +i);
				Thread.sleep(500);
			}
			
		}catch(InterruptedException e){
			System.out.println("Child intrupted.");
		}
		System.out.println("Exiting child thread.");
	}
	}
    class ExtendingThread{
		public static void main(String args[]){
			new ExThread();
			
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
