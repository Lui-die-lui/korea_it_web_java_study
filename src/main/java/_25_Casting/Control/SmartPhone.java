package _25_Casting.Control;

public class SmartPhone implements Power{
    @Override
    public void onPower() {
        System.out.println("스마트폰의 전원을 켭니다.");

    }

    @Override
    public void offPower() {
        System.out.println("스마트폰의 전원을 끕니다.");

    }

    public void cameraButton() {
        System.out.println("스마트폰의 카메라 버튼을 실행 시킵니다.");

    }
}
