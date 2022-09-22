package com.main;

import com.beans.Client;

import java.util.Scanner;

public class ApplicationClient {

    public static Scanner scan = new Scanner(System.in);

    public void AppliClient (Client client){

        int choix;

        do{
            affichageMenu();
            affichageFinMenu();

            choix = scan.nextInt();

            switch (choix) {

                case 1 :
                    client.afficherSolde();
                    break;

                case 2 :
                    effectuerVersement(client);
                    break;

                case 3 :
                    effectuerRetrait(client);
                    break;
                case 4 :
                    demandeDecouvert(client);

            }


        }while(choix !=0);

    }

    public void demandeDecouvert(Client client) {
        double montantDecouvert = demandeMontant();
        int choixCompteDecouvert = demandeCompte(client);
        client.getListeCompte().get(choixCompteDecouvert).setMontantDecouvert(montantDecouvert);
    }

    public void effectuerRetrait(Client client) {
        double montantRetrait = demandeMontant();
        int choixCompteRetrait = demandeCompte(client);
        client.retirerArgent(client.getListeCompte().get(choixCompteRetrait), montantRetrait);
    }

    public void effectuerVersement(Client client) {
        double montantVersement = demandeMontant();
        int choixCompteVersement = demandeCompte(client);
        client.verserArgent(client.getListeCompte().get(choixCompteVersement),montantVersement);
    }

    public double demandeMontant(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez indiquer le montant ? ");
        double montant = scan.nextDouble();
        return montant;
    }

    public int demandeCompte(Client client){
        System.out.println("Sur quel compte vous souhaitez faire l'action ? Tapez le numero correspondant");
        for(int i=0;i<client.getListeCompte().size();i++){
            System.out.println(i+ " - "+ client.getListeCompte().get(i).getNomDuCompte());
        }
        int choix = scan.nextInt();
        return choix;
    }

    public void affichageMenu(){
        System.out.println("1-Afficher le solde ");
        System.out.println("2-Effectuer un versement");
        System.out.println("3-Effectuer un retrait");
        System.out.println("4-Demander un decouvert");
    }

    public void affichageFinMenu(){
        System.out.println("0-Tapez 0 pour quitter");
    }

}
