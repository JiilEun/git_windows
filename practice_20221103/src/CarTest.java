public class CarTest {
    public static void main(String[] args) {
        Car tesla = new Car("Model 3", "빨강");

        System.out.println("내 차의 모델은 " + tesla.model + "이고, 색은 " + tesla.color + "입니다.");
        tesla.power();
        tesla.accelerate();
        tesla.stop();
    }
}
