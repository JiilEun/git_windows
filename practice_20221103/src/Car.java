public class Car {
    public String model;
    public String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void power() {
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("더 빠르게!");
    }

    void stop() {
        System.out.println("멈춰!!");
    }
}
