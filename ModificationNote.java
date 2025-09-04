import java.time.LocalDateTime;

public class ModificationNote {
    private double valeur;
    private LocalDateTime dateModification;
    private String motif;

    public ModificationNote(double valeur, LocalDateTime dateModification, String motif) {
        this.valeur = valeur;
        this.dateModification = dateModification;
        this.motif = motif;
    }

    public double getValeur() { return valeur; }
    public LocalDateTime getDateModification() { return dateModification; }
    public String getMotif() { return motif; }
}