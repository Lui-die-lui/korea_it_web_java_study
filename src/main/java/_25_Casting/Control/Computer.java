package _25_Casting.Control;

public class  Computer implements Power {
    @Override
    public void onPower() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void offPower() {
        System.out.println("컴퓨터의 전원을 끕니다.");

    }

    public void compute() {
        System.out.println("컴퓨터가 연산을 합니다.");
    }
}
