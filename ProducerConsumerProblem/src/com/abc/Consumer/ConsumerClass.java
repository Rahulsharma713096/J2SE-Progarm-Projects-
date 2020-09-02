package com.abc.Consumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerClass implements Runnable {
//Declare a refral variable to hold priority queue
	protected BlockingQueue<String> pbq;
//Generate Constructor
	public ConsumerClass(BlockingQueue<String> pbq) {
		super();
		this.pbq = pbq;
	}
@Override
	public void run() {
		
	while(true) {
		try {
			String data = pbq.take();
			System.out.println(Thread.currentThread().getName()+"take()"+data);
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}
}
