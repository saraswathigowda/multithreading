package com.multithread.examples;

class Callme{
	void call(String msg){
		System.out.print("[" +msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Intrrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme targ, String s) {
		// TODO Auto-generated constructor stub
		target = targ;
		msg = s;
		t= new Thread(this);
		t.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (target) {
			target.call(msg);
		}
	}
}
public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchonized");
		Caller ob3 = new Caller(target, "World");
		
		//wait for threads to end
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e){
			System.out.println("Intrrupted");
		}
	}
}
