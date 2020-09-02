package com.abc.Producer;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class ProducerClass implements Runnable {
	//Declare a refral variable to hold priority queue
		protected BlockingQueue<String> pbq;
	//Generate Constructor
		public ProducerClass(BlockingQueue<String> pbq) {
			super();
			this.pbq = pbq;
		}
	@Override
	public void run() {
		while(true) {
			try {
					//generate random UUID
					String data=UUID.randomUUID().toString();
					System.out.println("put()"+data);
					//Store UUID in PriorityBlockingQueue
				pbq.put(data);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
