package _21_Class.Car;

public class Car {
    String carName;
    int carYearModel;
    String carColor;

    //생성자
     Car() { // 기본 생성자
         System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
         System.out.println("NoArgsConstructor"); //스프링부트에서도 나옴
     }

     Car(String carName) { // 같은이름 - 오버로딩으로 볼 수 있음 / 일반적으로 매개변수명과 일치
         System.out.println("carName의 속성값이 부여된 자동차");
         System.out.println("RequiredArgsConstructor");
         this.carName = carName; // 생성과 동시에 이름 넣기 / this - 자기자신
     }

     Car(String carName, int carYearModel, String carColor) {
         System.out.println("모든 속성값이 부여된 자동차");
         System.out.println("AllArgsConstructor");
         this.carName = carName;
         this.carYearModel = carYearModel;
         this.carColor = carColor;
     }

    public void startCar() {
        System.out.println(carName + " 차량 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + " 차량이 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + " 차량이 정차합니다.");
    }

}
