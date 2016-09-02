package com.multithread.examples;

class NewThread2 implements Runnable{

	String name;
	Thread t;
	
	 NewThread2(String threadName) {
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

public class IsAliveAndJoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread2 ob1 = new NewThread2("One");
		NewThread2 ob2 = new NewThread2("Two");
		NewThread2 ob3 = new NewThread2("Three");
		
		System.out.println("Thread one is alive: " + ob1.t.isAlive());
		System.out.println("Thread two is alive: " + ob2.t.isAlive());
		System.out.println("Thread three is alive: " + ob3.t.isAlive());
		
		try{
			System.out.println("Waiting for thread to finish.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread Intrrupted");
		}
		System.out.println("Thread one is alive: " + ob1.t.isAlive());
		System.out.println("Thread two is alive: " + ob2.t.isAlive());
		System.out.println("Thread three is alive: " + ob3.t.isAlive());
		
		System.out.println("Main thread exiting.");
	}
}
