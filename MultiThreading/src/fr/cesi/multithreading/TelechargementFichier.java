package fr.cesi.multithreading;

public class TelechargementFichier extends Thread{

	private String nomFichier;

	public TelechargementFichier(String nomFichier) {
		super();
		this.nomFichier = nomFichier;
	}
	
	public void run() {
		System.out.println("Début téléchargement de fichier " + nomFichier);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
