package _13_BreakContinue;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break, continue
        // break - 특정 상황(조건)에서 반복문을 빠져나옴

        // 톤쇼우 웨이팅 50명
        // 판매 가능한 갯수 10개
        int waiting = 50;
        int max = 10;
        for (int i = 1 ; i < waiting ; i++) { // 가게 운영중 i(음식)
            System.out.println(i + "번 손님 입장");
            if(i == max ) { //10개 판매 가능
                System.out.println("재료 소진!");
                break; // 빠져나옴
            }
        }
        System.out.println("영업 종료");

        System.out.println("-----------------------------");

        int nouNum = 1;
        while (nouNum <= waiting) { //현재 입장번호 <= 웨이팅 하는 수
            System.out.println(nouNum + "번 손님 입장!");
            if (nouNum == max) {
                System.out.println("재료 소진");
                break;
            }
            nouNum++; // 더해줘서 입장 번호 올려줘야함
        }
        System.out.println("영업 종료");
    }
}
