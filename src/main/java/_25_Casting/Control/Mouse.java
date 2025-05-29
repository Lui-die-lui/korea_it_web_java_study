package _25_Casting.Control;

public class Mouse implements Power{
    @Override
    public void onPower() {
        System.out.println("마우스의 전원을 켭니다.");
    }

    @Override
    public void offPower() {
        System.out.println("마우스의 전원을 끕니다.");
    }

    public void rollMouse() {
        System.out.println("마우스의 스크롤 버튼을 사용합니다.");
    }
}
