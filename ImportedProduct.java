package Mod14_Exer;

public class ImportedProduct extends Product {

    private Double customsFree;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }

    @Override
    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", price)
                + String.format("%.2f", customsFree);
    }

    public Double totalPrice(Double price) {
        return price + customsFree;
    }

}
