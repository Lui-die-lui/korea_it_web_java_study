package _23_Abstraction;

public class PhoneFactory extends Factory {
    //추상클래스를 상속받으면 반드 시 재정의 해줘야함

    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");

    }

//    public PhoneFactory(String name) {
//
//    }
}
