package fr.cesi.multithreading;

public class Multithreading {

	public static void main(String[] args) {
		MonThread thread1 = new MonThread();
		MonThread thread2 = new MonThread();
		
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin du programme");
	}

}
