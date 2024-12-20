package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {
    private int idCommande;
    private Date dateCommande;
    private List<Ligne> lignes;

    public Commande(int idCommande, Date dateCommande) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.lignes = new ArrayList<>();
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void ajouterLigne(Article article, int qteCommande) {
        Ligne ligneExistante = lignes.stream()
                .filter(l -> l.getArticle().equals(article))
                .findFirst()
                .orElse(null);
        if (ligneExistante != null) {
            ligneExistante.setQteCommande(ligneExistante.getQteCommande() + qteCommande);
        } else {
            lignes.add(new Ligne(article, qteCommande));
        }
    }

    public void supprimerLigne(Article article) {
        lignes.removeIf(l -> l.getArticle().equals(article));
    }

    public double valoriserCommande() {
        return lignes.stream().mapToDouble(Ligne::getMontantLigne).sum();
    }
}
