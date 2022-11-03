public class Computer {
    String cpu;
    String ram;
    String ssd;
    int yearOfManufacture;
    Double price;
    boolean isOn;

    public Computer(String cpu, String ram, String ssd, int yearOfManufacture, Double price, boolean isOn) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.isOn = isOn;
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("intel i7", "32gb", "256gb", 2018, 100.25, true);
        Computer myOldComputer = new Computer("intel i5", "16gb", "128gb", 2015, 75.25, false);

        System.out.println(myComputer.yearOfManufacture);
        System.out.println(myOldComputer.cpu);

    }
}
