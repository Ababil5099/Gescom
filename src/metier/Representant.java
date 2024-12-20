package metier;

import java.util.List;

public class Representant {
    private int idRepresentant;
    private String nom;
    private String prenom;
    private Client[] listeClients;

    public Representant(int idRepresentant, String nom, String prenom) {
        this.idRepresentant = idRepresentant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Representant(int idRepresentant, java.lang.String paul, java.lang.String auchon) {
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

    public Client getClientById(int idClient) {
        for (Client client : this.listeClients) {
            if (client.getIdClient() == idClient) {
                return client;
            }
        }
        return null; // Retourne null si aucun client avec cet ID n'est trouvé
    }
    public List<Client> getListeClients() {
        return List.of(this.listeClients); // Retourne la liste des clients du représentant
    }


}
