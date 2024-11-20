import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<IceCreamFlavor> flavors = new ArrayList<>();
    private final List<Topping> toppings = new ArrayList<>();
    private final boolean waffleCone;

    public Order(boolean waffleCone) {
        this.waffleCone = waffleCone;
    }

    public void addFlavor(IceCreamFlavor flavor) {
        flavors.add(flavor);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateSubtotal() {
        double total = 0;
        for (IceCreamFlavor flavor : flavors) {
            total += flavor.getPricePerScoop();
        }
        for (Topping topping : toppings) {
            total += topping.getPrice();
        }
        if (waffleCone) {
            total += 5.00;
        }
        return total;
    }

    public double calculateTax() {
        return calculateSubtotal() * 0.08;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
