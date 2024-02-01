import java.text.SimpleDateFormat;
import java.util.Date;

// Class yang mengimplementasikan interface LaundryTransaction
class TokoLaundry implements LaundryTransaction {

    private Integer id;  // New field added

    // Constructor that initializes the id
    public TokoLaundry(Integer id) {
        this.id = id;
    }

    // Getter and setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Method implementasi dari interface untuk menghitung total pembayaran
    @Override
    public double calculateTotal(double quantity, double price) {
        return quantity * price;
    }

    // Method implementasi dari interface untuk menampilkan struk pembayaran
    @Override
    public void printReceipt(Integer id, String customerName, String productName, double quantity, double total) {
        System.out.println("===== Struk Pembayaran Laundry =====");
        System.out.println("ID Transaksi: " + id);  // Display the id
        System.out.println("Customer: " + customerName);
        System.out.println("Produk: " + productName);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Total Pembayaran: " + total);
        System.out.println("Tanggal Transaksi: " + getCurrentDate());
        System.out.println("Terima kasih atas pembeliannya!");
    }

    // Method untuk mendapatkan tanggal saat ini
    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    // Method untuk menampilkan semua struk
    public static void tampilkanSemuaStruk() {
    
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanSemuaStruk'");
    }


    @Override
    public String toString() {
        return "TokoLaundry [id=" + id + "]";
    }
    
}
