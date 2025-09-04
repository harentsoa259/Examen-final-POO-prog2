import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Note {
    private Etudiant etudiant;
    private Examen examen;
    private List<ModificationNote> historique;

    public Note(Etudiant etudiant, Examen examen, double valeurInitiale, String motif) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.historique = new ArrayList<>();
        this.historique.add(new ModificationNote(valeurInitiale, LocalDateTime.now(), motif));
    }

    public void modifierNote(double nouvelleValeur, String motif) {
        historique.add(new ModificationNote(nouvelleValeur, LocalDateTime.now(), motif));
    }

    public double getValeurActuelle() {
        return historique.get(historique.size() - 1).getValeur();
    }

    public double getValeurA(Instant instant) {
        LocalDateTime dateRecherche = LocalDateTime.ofInstant(instant, java.time.ZoneId.systemDefault());
        double derniereValeur = 0;
        for (ModificationNote mod : historique) {
            if (!mod.getDateModification().isAfter(dateRecherche)) {
                derniereValeur =+ mod.getValeur();
            } else {
                break;
            }
        }
        return derniereValeur;
    }

    public static void main(String[] args) {
        Enseignant DrToky = new Enseignant(5, "RAMAROZAKA", "Toky", null, "toky@gmai.com", null, "Developpement Back end");
        Tuteur Dada = new Tuteur(2, "Rakotoarisoa", "Joely", null, null, "034 .......", "Harentosa");
        Etudiant harentsoa = new Etudiant(1, "Rakotoarisoa", "Harentsoa", null, "harentsoa@gmail.com", "032 26 018 33", "K4", Dada);
        Cours prog = new Cours(0, "Prog1", 0, DrToky);
        Examen Prog1 = new Examen(3, "Examen final", prog, null, 8);
        Note NoteDeharentsoaa = new Note(harentsoa, Prog1, 9, null);
        NoteDeharentsoaa.modifierNote(13, "Bonus de 3 point");
        System.out.println(NoteDeharentsoaa.toString());
    }
}