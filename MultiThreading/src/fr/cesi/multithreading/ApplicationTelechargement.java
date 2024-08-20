package fr.cesi.multithreading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationTelechargement {

	public static void main(String[] args) {
		
		List<String> fichierATelecharger = new ArrayList<>();
		fichierATelecharger.add("fichier1.txt");
		fichierATelecharger.add("fichier2.txt");
		fichierATelecharger.add("fichier3.txt");
		
		
		List<TelechargementFichier> threadsDeTelechargement = new ArrayList<>();
		// créer un thread de téléchargement pour chaque fichier
		for(String fichier : fichierATelecharger) {
			TelechargementFichier thread = new TelechargementFichier(fichier);
			threadsDeTelechargement.add(thread);
			thread.start();
		}
		// attendre que les thread de téléchargement se terminent
		for(TelechargementFichier thread: threadsDeTelechargement) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("Tous les téléchargements sont terminées");
	}
}
