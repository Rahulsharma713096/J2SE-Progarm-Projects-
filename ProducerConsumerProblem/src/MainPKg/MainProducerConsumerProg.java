package MainPKg;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import com.abc.Consumer.ConsumerClass;
import com.abc.Producer.ProducerClass;

public class MainProducerConsumerProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final  BlockingQueue<String> pbq = new PriorityBlockingQueue<String>();
		new Thread(new ProducerClass(pbq)).start();
		new Thread(new ConsumerClass(pbq)).start();
		new Thread(new ConsumerClass(pbq)).start();
		new Thread(new ConsumerClass(pbq)).start();
		

	}

}
