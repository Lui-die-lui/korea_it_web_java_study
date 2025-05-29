package _25_Casting.Control;

public class Speaker implements Power {
    @Override
    public void onPower() {
        System.out.println("스피커의 전원을 켭니다.");

    }

    @Override
    public void offPower() {
        System.out.println("스피커의 전원을 끕니다.");

    }

    public void upVolume() {
        System.out.println("스피커의 볼륨을 올립니다.");
    }
}
