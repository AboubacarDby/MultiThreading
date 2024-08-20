package fr.cesi.multithreading;

public class MonThread extends Thread {
	
	
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Thread 1 - Iteration :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
