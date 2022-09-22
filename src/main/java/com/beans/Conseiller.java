package com.beans;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Client{

    private List<Client> listeClient = new ArrayList<>();

    public Conseiller(){};

    public Conseiller(String nom, String prenom, String identifiant, String motDePasse) {
        super(nom, prenom, identifiant, motDePasse);
    }


    public void ajouterNouveauClient(String nom,String prenom,String identifiant,String motDePasse){
        Client client = new Client();
        listeClient.add(client);
    }

    public void ajouterClient(Client client){
        listeClient.add(client);
    }

    public void creerComptePourClient(String nomDuCompte, Client client)
    {
        Compte compte = new Compte(nomDuCompte);
        client.addCompte(compte);
    }

    public void supprimerComptePourClient(Client client, Compte compte)
    {
        client.getListeCompte().remove(compte);
    }


}
