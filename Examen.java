import java.time.LocalDateTime;


public class Examen {
    private int id;
    private String titre;
    private Cours cours;
    private LocalDateTime dateHeure;
    private double coefficient;

    public Examen(int id, String titre, Cours cours, LocalDateTime dateHeure, double coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public Cours getCours() { return cours; }
    public LocalDateTime getDateHeure() { return dateHeure; }
    public double getCoefficient() { return coefficient; }
}
