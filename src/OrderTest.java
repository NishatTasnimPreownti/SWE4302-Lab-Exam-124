import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OrderTest {
    @Test
    public void testMultipleFlavorsAndToppings() {
        Order order = new Order(false);
        order.addFlavor(new ChocolateFudge());
        order.addFlavor(new StrawberrySwirl());
        order.addTopping(new Marshmallow());
        order.addTopping(new CrushedOreo());

        double expectedSubtotal = 3.00 + 2.75 + 0.70 + 0.85;
        double expectedTax = expectedSubtotal * 0.08;
        double expectedTotal = expectedSubtotal + expectedTax;

        assertEquals(expectedSubtotal, order.calculateSubtotal(), 0.01);
        assertEquals(expectedTax, order.calculateTax(), 0.01);
        assertEquals(expectedTotal, order.calculateTotal(), 0.01);
    }

    @Test
    public void testEmptyOrder() {
        Order order = new Order(false);
        assertEquals(0.00, order.calculateSubtotal(), 0.01);
        assertEquals(0.00, order.calculateTax(), 0.01);
        assertEquals(0.00, order.calculateTotal(), 0.01);
    }
}
