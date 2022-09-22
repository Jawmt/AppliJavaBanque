package com.main;

import com.beans.Client;
import com.beans.Compte;
import com.beans.Conseiller;
import com.beans.Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client("client 1","nomClient 1","client1","mdp");
        Conseiller conseiller = new Conseiller("Conseiller 1","nomConseiller 1","conseiller1","mdp");

        Compte compte = new Compte("Compte 1");
        Compte compte2 = new Compte("Compte 2");
        client.addCompte(compte);
        conseiller.addCompte(compte2);

        int choix;

        do{
            affichageMenu();
            choix = scanner.nextInt();
            switch (choix){
                case 1:
                    ApplicationClient applicationClient = new ApplicationClient();
                    applicationClient.AppliClient(client);
                case 2:
                    ApplicationConseiller applicationConseiller = new ApplicationConseiller();
                    applicationConseiller.AppliConseiller(conseiller);
            }

        }while(choix!=0);




    }

    public static void affichageMenu(){
        System.out.println("1-Application Client");
        System.out.println("2-Application Conseiller");
        System.out.println("Tapez 0 pour quitter !");
    }



}
