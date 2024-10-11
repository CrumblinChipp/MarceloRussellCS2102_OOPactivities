class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    public String toString() {
        String sizeDescription;
        switch (size) {
            case 'S':
                sizeDescription = "small";
                break;
            case 'M':
                sizeDescription = "medium";
                break;
            case 'L':
                sizeDescription = "large";
                break;
            default:
                sizeDescription = "Invalid Size";
                break;
        }
        return "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + sizeDescription;
    }
    
    public static void main (String args[]){
        Car car1 = new Car("red", 19999.85, 'm');
        Car car2 = new Car("blue", 50000, 'l');
        
        String sampleCar1 = car1.toString();
        String sampleCar2 = car2.toString();
        
        System.out.println(sampleCar1);
        System.out.println(sampleCar2);

    }
}