public class Avion implements Flyable{
    private double prix;
    private String marque;
    private double vitesseMax;
    public Avion(double price, String marque, double vitesseMax){
        this.marque = marque;
        this.prix = price;
        this.vitesseMax = vitesseMax;
    }

    public double getPrix() {
        return prix;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void fly(String energy) {
        System.out.println("Je vole man!!!! avec du " + energy);
    }
}
