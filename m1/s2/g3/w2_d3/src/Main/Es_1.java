package Main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Es_1 implements Runnable{
	
	private static final Logger logger = LoggerFactory.getLogger(Es_1.class);
	
	private String simbolo;

	public Es_1(String simbolo) {
		this.simbolo = simbolo;
	}

	public static void main(String[] args) {

		Es_1 runnable1 = new Es_1("#");
		Es_1 runnable2 = new Es_1("*");

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(simbolo);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			logger.error("Errore", e);
		}

	}
}
