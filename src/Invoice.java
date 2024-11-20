import java.io.FileWriter;
import java.io.IOException;

public class Invoice {
    public static void generateInvoice(Order order, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {

        } catch (IOException e) {
            System.err.println("Failed to generate invoice: " + e.getMessage());
        }
    }
}
