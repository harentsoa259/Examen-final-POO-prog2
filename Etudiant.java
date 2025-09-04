
import java.time.LocalDate;


public class Etudiant extends Personne {
    private String groupe;
    private Tuteur tuteur;

    public Etudiant(int id, String nom, String prenom, LocalDate dateNaissance,String email, String telephone, String groupe, Tuteur tuteur) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public String getGroupe() { return groupe; }
    public Tuteur getTuteur() { return tuteur; }

    @Override
    public String toString() {
        return "Personne{id="+ getId() +
                " , nom et prenom=" + getNom()+getPrenom() +
                " , Date de naissance="+getDateNaissance() +
                " , Email="+getEmail()+
                " , Telephone="+getTelephone() +
                " , Groupe="+getGroupe()+
                " , Tuteur="+getTuteur()
                +
           "}";
    }
}
