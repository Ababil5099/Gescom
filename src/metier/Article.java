package metier;

public class Article {

    /* Propriétés privées */
    private int idArticle;
    private String designation;
    private double caArticle; // Chiffre d'affaires généré par l'article
    private int qteStock; // Quantité en stock
    private double prix; // Prix unitaire de l'article
    private Categorie categorie; // Association avec la classe Categorie
    private Famille famille; // Association avec la classe Famille

    /* Constructeurs */
    public Article(int idArticle, String designation, double caArticle, int qteStock, double prix, Categorie categorie, Famille famille) {
        this.idArticle = idArticle;
        this.designation = designation;
        this.caArticle = caArticle;
        this.qteStock = qteStock;
        this.prix = prix;
        this.categorie = categorie;
        this.famille = famille;
    }

    /* Getters et Setters */
    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getCaArticle() {
        return caArticle;
    }

    public void setCaArticle(double caArticle) {
        this.caArticle = caArticle;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    /* Méthodes supplémentaires */

    /**
     * Vérifie si l'article est en stock.
     * @return true si l'article est disponible, sinon false.
     */
    public boolean estEnStock() {
        return qteStock > 0;
    }

    /**
     * Diminue la quantité en stock après une commande.
     * @param quantite Quantité à déduire
     * @throws IllegalArgumentException si la quantité demandée dépasse le stock disponible.
     */
    public void diminuerStock(int quantite) {
        if (quantite > qteStock) {
            throw new IllegalArgumentException("Stock insuffisant pour l'article : " + designation);
        }
        qteStock -= quantite;
    }

    /**
     * Augmente le chiffre d'affaires de l'article.
     * @param montant Montant à ajouter au chiffre d'affaires
     */
    public void augmenterCa(double montant) {
        caArticle += montant;
    }

    @Override
    public java.lang.String toString() {
        return "Article{" +
                "idArticle=" + idArticle +
                ", designation='" + designation + '\'' +
                ", caArticle=" + caArticle +
                ", qteStock=" + qteStock +
                ", prix=" + prix +
                ", categorie=" + (categorie != null ? categorie.getLibCategorie() : "Aucune") +
                ", famille=" + (famille != null ? famille.getLibFamille() : "Aucune") +
                '}';
    }
}
