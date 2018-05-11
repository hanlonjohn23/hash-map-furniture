public class Recliner implements Furniture {
    private String name;
    private int modelNr;
    private int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getModelNr() {
        return modelNr;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public Recliner(String name, int modelNr, int price){
        this.name = name;
        this.modelNr = modelNr;
        this.price = price;
    }
}
