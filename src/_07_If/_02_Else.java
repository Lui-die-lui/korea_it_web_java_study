package _07_If;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 if Else
        int hour = 10;
        if (hour < 14) { // 오후 2시 이전이면
            System.out.println("아이스 아메리카노 + 1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #1");
        // "아이스 아메리카노 + 1" 주문

        hour = 17;
        if (hour < 14) { // 오후 2시 이전이면
            System.out.println("아이스 아메리카노 + 1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #2");
        //"아이스 아메리카노 (디카페인) + 1" 주문
        //그 외의 경우이기 때문에 else 값이 출력

        //오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 10;
        boolean moningCoffee = false;
        if (hour >= 14 || moningCoffee == true) { // || : or 연산 (또는) / 오후 2시 이후이거나 모닝커피를 마신 경우?
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #3");



    }
}
