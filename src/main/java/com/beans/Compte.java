package com.beans;

public class Compte {

    private String nomDuCompte;
    private double solde;
    private double montantDecouvert;

    public Compte(String nomDuCompte){
        this.nomDuCompte = nomDuCompte;
        this.solde = 0;
        this.montantDecouvert = 0;
    }

    public String getNomDuCompte() {
        return nomDuCompte;
    }

    public void setNomDuCompte(String nomDuCompte) {
        this.nomDuCompte = nomDuCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getMontantDecouvert() {
        return montantDecouvert;
    }

    public void setMontantDecouvert(double montantDecouvert) {
        this.montantDecouvert = montantDecouvert;
    }
}
