package Task2;

import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {

    @Test
    public void test_1() {
        Order order = new Order();
        order.addFlavour(new ChocolateFudge(2));
        assertEquals("Chocolate Fudge", order.flavours.getFirst().name);
    }


    @Test
    public void test_2() {
        Order order = new Order();
        order.addFlavour(new ChocolateFudge(2));
        assertEquals(, order.flavours.getFirst().price);
    }


    @Test
    public void test_3() {
        Order order = new Order();
        order.addFlavour(new ChocolateFudge(2));
        assertEquals("Chocolate Fudge", order.flavours.getFirst().name);
    }


    @Test
    public void test_4() {
        Order order = new Order();
        order.addFlavour(new ChocolateFudge(2));
        assertEquals("Chocolate Fudge", order.flavours.getFirst().name);
    }


    @Test
    public void test_5() {
        Order order = new Order();
        order.addFlavour(new ChocolateFudge(2));
        assertEquals("Chocolate Fudge", order.flavours.getFirst().name);
    }



    @org.junit.jupiter.api.Test
    public void test_writer() throws FileNotFoundException {}
}
