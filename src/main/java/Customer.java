import java.util.Date;

public class Customer {
    private long id;
    private String name;
    private Date customerSince;
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}