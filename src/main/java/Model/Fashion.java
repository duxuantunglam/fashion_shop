package Model;

public class Fashion {
    private String name;
    private int id;
    private String color;
    private String material;
    private String brand;
    private double length;
    private double width;
    private int amount;
    private String date;

    public Fashion() {
    }

    public Fashion(String name, int id, String color, String material, String brand, double length, double width, int amount, String date) {
        this.name = name;
        this.id = id;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.length = length;
        this.width = width;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public double caculate(double coefficient){
        return 0;
    }
        
    public double caculate(double coefficient, double discount){
        return 0;
    }
    
}

