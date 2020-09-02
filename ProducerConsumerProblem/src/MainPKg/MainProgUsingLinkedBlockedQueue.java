package MainPKg;

import java.util.concurrent.LinkedBlockingQueue;

import com.abc.Consumer.ConsumerClass;
import com.abc.Producer.ProducerClass;

public class MainProgUsingLinkedBlockedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBlockingQueue<String> lbq = new LinkedBlockingQueue<String>(3);
		new Thread(new ProducerClass(lbq)).start();
		new Thread(new ConsumerClass(lbq)).start();

	}

}
