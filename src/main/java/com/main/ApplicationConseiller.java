package com.main;

import com.beans.Client;
import com.beans.Conseiller;

public class ApplicationConseiller extends ApplicationClient{

    public void AppliConseiller (Conseiller conseiller)
    {
        int choix;
        do{
            affichageMenu();
            super.affichageFinMenu();
            choix = scan.nextInt();

            switch (choix){
                case 1:
                    conseiller.afficherSolde();
                case 2:
                    super.effectuerVersement(conseiller);
                case 3:
                    super.effectuerRetrait(conseiller);
                case 4:
                    super.demandeDecouvert(conseiller);
                case 5:
                    int choixCompte = sousMenu();
            }
        }while(choix !=0);

    }

    public  int sousMenu() {
        System.out.println("1-Ouvrir un compte pour un nouveau client");
        System.out.println("2-Ouvrir un compte pour un client existant");
        int value = scan.nextInt();
        return value;
    }


    @Override
    public void affichageMenu() {
        super.affichageMenu();
        System.out.println("5-Ouvrir un compte pour un client");
        System.out.println("6-Fermer un compte pour un client");

    }
}
