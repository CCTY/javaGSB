/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

public class Parametres {

private String nomUtilisateur;

private String motDePasse;

private String serveurBD;

private String driverSGBD;

    public Parametres() {
        nomUtilisateur = "root"; 

        motDePasse = "";

        driverSGBD = "org.gjt.mm.mysql.Driver";

        serveurBD = "jdbc:mysql://localhost/FacturationGSB";
    }


    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setServeurBD(String serveurBD) {
        this.serveurBD = serveurBD;
    }

    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getServeurBD() {
        return serveurBD;
    }

    public String getDriverSGBD() {
        return driverSGBD;
    }


}
