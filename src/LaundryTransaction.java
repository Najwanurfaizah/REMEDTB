// Interface untuk transaksi laundry
interface LaundryTransaction {
    // Method untuk menghitung total pembayaran
    double calculateTotal(double quantity, double price);

    // Method untuk menampilkan struk pembayaran
    void printReceipt(Integer id, String customerName, String productName, double quantity, double total);
}