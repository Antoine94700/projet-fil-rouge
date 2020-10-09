package org.eclipse.main;

import java.util.Scanner;

import org.eclipse.model.Client;
import org.eclipse.model.Produit;
import org.eclipse.service.ProduitService;

public class Main {

//	public static void menuClient() {
//
//	}
//
//	public static void menuVendeur() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Saisir 1 pour ajouter, 2 pour modifier, 3 pour supprimer");
//		int choix = scanner.nextInt();
//		while (choix == 1 || choix == 2 || choix == 3) {
//			switch (choix) {
//			case 1:
//				
//				break;
//			case 2:
//				break;
//			case 3:
//				break;
//			default:
//
//			}
//			System.out.println("Saisir 1 pour vendeur, 2 pour client, 0 pour quitter");
//			choix = scanner.nextInt();
//		}
//	}

	public static void main(String[] args) {
//		Scanner scanner = new java.util.Scanner(System.in);
		ProduitService produitService = new ProduitService();
		Produit produit = new Produit(1, "clavier", "clavier azerty", null, 10, 20);
		produitService.save(produit);
		produitService.save(new Produit(2, "ecran", "17 pouces", null, 200, 10));
		System.out.println(produitService.getProduits());
		produit.setQuantiteEnStock(150);
		produitService.update(produit);
		System.out.println(produitService.getProduits());
//		produitService.remove(produit);
//		System.out.println(produitService.getProduits());
//		System.out.println("Saisir 1 pour vendeur, 2 pour client, 0 pour quitter");
//		int choix = scanner.nextInt();
//		while (choix == 1 || choix == 2) {
//			switch (choix) {
//			case 1:
//
//				break;
//			case 2:
//				break;
//			default:
//			}
//			System.out.println("Saisir 1 pour vendeur, 2 pour client, 0 pour quitter");
//			choix = scanner.nextInt();
//		}
//		System.out.println("Merci de votre visite. Aurevoir et à bientôt.");
	}

}
