

// Class untuk merepresentasikan produk laundry
class LaundryProduct {
    
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String productName;
    private double price;

    // Constructor untuk inisialisasi objek LaundryProduct
    public LaundryProduct(Integer id, String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
     

    // Getter untuk mendapatkan nama produk
    public String getProductName() {
        return productName;
    }

    // Getter untuk mendapatkan harga produk
    public double getPrice() {
        return price;
    }
}


