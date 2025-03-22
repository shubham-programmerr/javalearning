class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Default Constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.speed = 0;
    }

    // Parameterized Constructor
    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + "), Speed: " + speed + " km/h");
    }

    // Method to accelerate
    public void accelerate(int incrementSpeed) {
        this.speed += incrementSpeed;
        System.out.println(brand + " " + model + " accelerated to " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Instantiate Car objects
        Car car1 = new Car("maruthi", "baleno", 2022, 50);
        Car car2 = new Car("Ford","Mustang", 2021, 70);

        // Display information before acceleration
        car1.displayInfo();
        car2.displayInfo();

        System.out.println("\n");
        // Accelerate the cars
        car1.accelerate(20);
        car2.accelerate(30);

        System.out.println("\n");

        // Display information after acceleration
        car1.displayInfo();
        car2.displayInfo();
    }
}
