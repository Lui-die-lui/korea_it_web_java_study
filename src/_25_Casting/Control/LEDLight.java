package _25_Casting.Control;

public class LEDLight implements Power{
    @Override
    public void onPower() {
        System.out.println("LED전구의 전원을 켭니다.");

    }

    @Override
    public void offPower() {
        System.out.println("LED전구의 전원을 끕니다.");

    }

    public void colorChange() {
        System.out.println("LED전구의 컬러를 바꿉니다.");

    }
}
