import java.util.Objects;

public class Sofa implements Furniture {
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

    public Sofa(String name, int modelNr, int price){
        this.name = name;
        this.modelNr = modelNr;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Sofa sofa = (Sofa) o;
        return this.modelNr == sofa.modelNr &&
                Objects.equals(this.name, sofa.name);
    }

    @Override
    public String toString() {
        return name + ' ' +
                "Model #: " + modelNr + ' ';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + modelNr;
        result = prime * result + (name == null ? 0 : name.hashCode());

        return result;
    }
}
