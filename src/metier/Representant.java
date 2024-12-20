package metier;

public class Representant {
    private int idRepresentant;
    private String nom;
    private String prenom;

    public Representant(int idRepresentant, String nom, String prenom) {
        this.idRepresentant = idRepresentant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getIdRepresentant() {
        return idRepresentant;
    }

    public void setIdRepresentant(int idRepresentant) {
        this.idRepresentant = idRepresentant;
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
}
