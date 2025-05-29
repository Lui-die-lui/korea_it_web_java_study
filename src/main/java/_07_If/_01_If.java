package _07_If;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10; // 오전 10시
//        if (조건)
//        ...수행할 명령 ...
        if (hour < 14)
            System.out.println("아이스 아메리카노 + 1");
        System.out.println("샷추가");
        System.out.println("커피 주문 완료#1");
        //if 문 내에서 하나의 문장을 실행할때는 {} 생략 가능

        //if 문장에 2개 이상의 문장을 넣게 되면, 수행 하고싶은 문장을 중괄호{} 영역구분 필요
        int hour02 = 15; // 오후 3시
        if (hour02 < 14) {
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료#2");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피 정보
        //if (hour < 14  && morningCoffee == false) // && : 모든조건 만족 하는지
        if (hour < 14  && !morningCoffee) // ! : 논리 부정 연산
        {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #3");

        //오후 2시 이후 이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
//        if (hour >= 14 ||  morningCoffee == true) { // || : 한쪽이 참이면 true 값 나옴
        if (hour >= 14 ||  morningCoffee) { // 이미 전에 morningCoffee의 값이 나와있기때문에 == true 생략 가능
            System.out.println("아이스 아메리카노(디카페인) + 1 ");
        }
        System.out.println("커피 주문 완료 #4");


    }
}