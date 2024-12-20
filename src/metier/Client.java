package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int idClient;
    private String raisonSociale;
    private double caClient;
    private List<Commande> commandes;
    private List<Commande> listeCommandes;

    public Client(int idClient, String raisonSociale) {
        this.idClient = idClient;
        this.raisonSociale = raisonSociale;
        this.commandes = new ArrayList<>();
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public double getCaClient() {
        return caClient;
    }

    public void setCaClient(double caClient) {
        this.caClient = caClient;
    }

    public void ajouterCommande(Commande commande) {
        commandes.add(commande);
        caClient += commande.valoriserCommande();
    }

    public Commande getCommandeById(int idCommande) {
        return commandes.stream()
                .filter(c -> c.getIdCommande() == idCommande)
                .findFirst()
                .orElse(null);
    }

    public void supprimerCommande(Commande commande) {
        commandes.remove(commande);
        caClient -= commande.valoriserCommande();
    }
    public List<Commande> getCommandes() {
        return this.listeCommandes; // Retourne la liste des commandes du client
    }

}
