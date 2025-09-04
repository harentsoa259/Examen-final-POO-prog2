import java.time.LocalDate;

public class Tuteur extends Personne {
    private String lienAvecEtudiant;

    public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance, 
                 String email, String telephone, String lienAvecEtudiant) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.lienAvecEtudiant = lienAvecEtudiant;
    }

    public String getLienAvecEtudiant() { return lienAvecEtudiant; }

        @Override
        public String toString() {
        return "Personne{id="+ getId() +
                " , nom et prenom=" + getNom()+getPrenom() +
                " , Date de naissance="+getDateNaissance() +
                " , Email="+getEmail()+
                " , Telephone="+getTelephone()+
                " , Lien avec l'etudiant="+getLienAvecEtudiant()
                +
           "}";
    }
}