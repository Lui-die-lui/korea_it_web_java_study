package _07_If;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        //한라봉 에이드가 있으면 +1
        //또는 망고 주스가 있으면 +1
        //또는 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 주스

        if (hallabongAde) { // 뒤 == true 생략
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #1");

       /* 한라봉 에이드 +1
        커피 주문 완료 #1*/

        // else if는 여러번 사용 가능

        hallabongAde = false; // 한라봉 에이드
        mangoJuice = false; // 망고 주스
        boolean orangeJuice = true; // 오렌지 주스

        if (hallabongAde) { // 뒤 == true 생략
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1"); // else if 한번 더!
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        /*오렌지 주스 +1
        커피 주문 완료 #2*/

        //else는 없어도 실행 가능

        hallabongAde = false; // 한라봉 에이드
        mangoJuice = false; // 망고 주스
        orangeJuice = false; // 오렌지 주스

        if (hallabongAde) { // 뒤 == true 생략
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1"); // else if 한번 더!
        }
        System.out.println("커피 주문 완료 #3");

        //커피 주문 완료 #3



    }




}