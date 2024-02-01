
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class LaundryProduct {
    

    private String productName;
    private double price;

    public LaundryProduct(Integer id, String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

interface LaundryTransaction {
    double calculateTotal(double quantity, double price);

    void printReceipt(Integer id, String customerName, String productName, double quantity, double total);
}

class TokoLaundry implements LaundryTransaction {

    @Override
    public double calculateTotal(double quantity, double price) {
        return quantity * price;
    }

    @Override
    public void printReceipt(Integer id, String customerName, String productName, double quantity, double total) {
        System.out.println("===== Struk Pembayaran Laundry =====");
        System.out.println("id: " + id);
        System.out.println("Customer: " + customerName);
        System.out.println("Produk: " + productName);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Total Pembayaran: " + total);
        System.out.println("Tanggal Transaksi: " + getCurrentDate());
        System.out.println("Terima kasih atas pembeliannya!");
    }

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    public void printReceipt(int id2, String customerName, double quantity, double total) {
  
        throw new UnsupportedOperationException("Unimplemented method 'printReceipt'");
    }
}




public class LaundryProgram {
    private static String id;
    public static void main(String[] args) {
        LaundryDatabase.createTransactionTable();

        try (Scanner scanner = new Scanner(System.in)) {
            TokoLaundry laundryShop = new TokoLaundry();

            while (true) {
                try {
                    System.out.print("Masukkan no id (0 untuk keluar): ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (id == 0) {
                        break;
                    }

                    System.out.print("Masukkan nama pelanggan: ");
                    String customerName = scanner.nextLine();

                    if (customerName.isEmpty()) {
                        throw new LaundryException("Nama pelanggan tidak boleh kosong");
                    }

                    System.out.print("Masukkan jumlah kilo pakaian yang akan dicuci: ");
                    double quantity = Double.parseDouble(scanner.nextLine());

                    if (quantity <= 0) {
                        throw new LaundryException("Jumlah pakaian harus lebih dari 0");
                    }

                    double total = laundryShop.calculateTotal(quantity, 5000.0);
                    laundryShop.printReceipt(id, customerName, quantity, total);

                    saveTransactionToDatabase(id, customerName, quantity, total);

                } catch (LaundryException | NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
    private static void saveTransactionToDatabase(int id, String customerName, double quantity, double total) {
     
        throw new UnsupportedOperationException("Unimplemented method 'saveTransactionToDatabase'");
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        LaundryProgram.id = id;
    }

    @Override
    public String toString() {
        return "LaundryProgram []";
    }
}
