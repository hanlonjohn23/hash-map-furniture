import java.util.Objects;

public class Table implements Furniture {
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

    public Table(String name, int modelNr, int price){
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
        Table table = (Table) o;
        return this.modelNr == table.modelNr &&
                Objects.equals(this.name, table.name);
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
