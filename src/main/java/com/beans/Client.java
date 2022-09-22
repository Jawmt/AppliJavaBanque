package com.beans;

import java.util.ArrayList;
import java.util.List;

public class Client extends Personne {
    private List<Compte> listeCompte = new ArrayList<Compte>();

    public Client(){};

    public Client(String nom, String prenom, String identifiant, String motDePasse) {
        super(nom, prenom, identifiant, motDePasse);
    }

    public void afficherSolde(){
        for(int i=0; i<this.listeCompte.size();i++){
            System.out.println((this.listeCompte.get(i).getNomDuCompte()) +" : Solde : "+(this.listeCompte.get(i).getSolde())+" € " +
                    "_ Decouvert : "+this.listeCompte.get(i).getMontantDecouvert()+ " € ");
        }
    }

    public void verserArgent(Compte compte,double montant){
        compte.setSolde(compte.getSolde()+montant);
    }

    public void retirerArgent(Compte compte, double montant){
        if(compte.getSolde() - montant < 0 - compte.getMontantDecouvert()){
            System.out.println("Vous n'avez pas assez de fond pour effectuer ce montant");
        }else{
            compte.setSolde(compte.getSolde()-montant);
        }
    }

    public void addCompte(Compte compte){
        listeCompte.add(compte);
    }

    public List<Compte> getListeCompte() {
        return listeCompte;
    }

    public void setListeCompte(List<Compte> listeCompte) {
        this.listeCompte = listeCompte;
    }



}
