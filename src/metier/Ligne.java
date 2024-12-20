package metier;

public class Ligne {
    private Article article;
    private int qteCommande;

    public Ligne(Article article, int qteCommande) {
        this.article = article;
        this.qteCommande = qteCommande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public double getMontantLigne() {
        return article.getPrix() * qteCommande;
    }
}
