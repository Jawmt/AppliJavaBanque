package com.beans;

public class Personne {
    private String nom;
    private String prenom;
    private String identifiant;
    private String motDePasse;


    public Personne(){};

    public Personne(String nom, String prenom, String identifiant, String motDePasse){
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
