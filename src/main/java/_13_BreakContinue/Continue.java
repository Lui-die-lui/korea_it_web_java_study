package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // 반복문 - continue
        // continue - 다시 처음으로 돌아간다

//        int waiting = 50; // 대기 인원수
//        int max = 20; // 판매 가능한 갯수
//        int sold = 0; // 현재 판매량
//        int noShow = 12; // 노쇼 번호

//        for (int i = 1; i < waiting ; i++) {
//            System.out.println(i + "번 손님 입장!");
//
//            if (i == noShow) {
//                System.out.println(i + ("번 손님 노쇼"));
//                continue; // 부딪히면 다시 앞으로 감
//            }
//
//            sold ++;
//            if (sold == max) {
//                System.out.println("재료 소진!");
//                break;
//            }
//
//        }

        int waiting = 50; // 대기 인원수
        int nowNum = 1; // 현재 입장 번호 (시작번호)
        int max = 20; // 판매 가능한 갯수
        int sold = 0; // 현재 판매량
        int noShow = 12; // 노쇼 번호
        while (nowNum <= waiting) {
            System.out.println(nowNum +"번 손님 입장!");

            if (nowNum == noShow){
                System.out.println(nowNum + "번 손님 노쇼함");
                nowNum++; //값이 올라가야 넘어감
                continue; //위로 올라감
            }

            sold ++; // 판매 처리
            if (sold == max) { //메뉴가 다 팔렸을때
                System.out.println("재료 소진!");
                break;
            }
            nowNum++;
        }


    }
}
