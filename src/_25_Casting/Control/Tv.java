package _25_Casting.Control;

public class Tv implements Power {

    @Override
    public void onPower() {
        System.out.println("Tv 의 전원을 켭니다.");

    }

    @Override
    public void offPower() {
        System.out.println("Tv 의 전원을 끕니다.");

    }

    public void upChannel() {
        System.out.println("Tv의 채널을 올립니다.");
    }
}
