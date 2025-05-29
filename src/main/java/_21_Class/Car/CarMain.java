package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
//        Car car1 = new Car("아반떼");
//        System.out.println(car1.carName);//생성할때 같이 넣었기 때문

        Car car1 = new Car();

        Car car2 = new Car("아반떼");

        Car car3 = new Car("싼타페", 2025,"White");

        System.out.println();

        car3.startCar();
        car3.drive(); // 여기만 봤을때 내부에 무슨 기능을 하는지 모름 - 복잡한 내부 동작을 감춤
        car3.stop();
    }
}
