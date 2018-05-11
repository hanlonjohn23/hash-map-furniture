import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class AddressTest {
public Address.Builder builder;

    @Before
    public void setup(){
        builder = new Address.Builder();
    }

    @Test
    public void builderStreetTest() {
        Address actual = builder.withStreet("Cherry Ridge").build();
        Assert.assertEquals("Cherry Ridge", actual.getStreet());
    }

    @Test
    public void builderStateTest() {
        Address actual = builder.withState("CA").build();
        Assert.assertEquals("CA", actual.getState());
    }

    @Test
    public void builderAptNrTest() {
        Address actual = builder.withAptNr("Cherry Ridge").build();
        Assert.assertEquals("Cherry Ridge", actual.getAptNr());
    }

    @Test
    public void toStringWithAptNrTest(){
        Address actual = builder.withStreet("5776 Cherry Ridge Dr.")
                .withAptNr("Apt 1")
                .withCity("Camarillo")
                .withState("CA")
                .withZipCode(93012)
                .build();
        Assert.assertEquals("5776 Cherry Ridge Dr., Apt 1, Camarillo, CA 93012", actual.toString());

    }

    @Test
    public void toStringWithOutAptNrTest(){
        Address actual = builder.withStreet("5776 Cherry Ridge Dr.")
                .withCity("Camarillo")
                .withState("CA")
                .withZipCode(93012)
                .build();
        Assert.assertEquals("5776 Cherry Ridge Dr., Camarillo, CA 93012", actual.toString());

    }

}