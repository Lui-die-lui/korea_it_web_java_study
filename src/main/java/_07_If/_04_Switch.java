package _07_If;

public class _04_Switch {
    public static void main(String[] args) {
        // Switch Case

        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        int ranking = 3; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금"); // 값이 같기 때문에 || or 사용 가능
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        //else if = 여러조건 또는 범위에 대한 결과를 낼 때 사용

        //Switch Case 문을 이용
        /* switch ( expression 표현 )  {
            case A: ... 수행할 명령...
                break;
            case B: ... 수행할 명령...
                break;
            case C: ... 수행할 명령...
                break;
                ...
            default: ...수행할 명령...
        } */
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // 탈출
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2 , 3 통합

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // 탈출
            case 2: // 수행 할 문장이 없기때문에 다음으로 넘어감
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        //중고상품의 등급에 다른 가격을 책정 (1급 : 최상, 4급 : 최하)

        int grade = 3; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // = price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
        //1등급 제품의 가격 : 10000 break 없어서 전부 작동
        //2등급 제품의 가격 : 9000 - case 1 통과 2,3 작동
        //3등급 제품의 가격 : 8000 - case 1,2 통과 3 작동

        //break를 이용해 한번에 연산 하도록 유도 가능

        //switch case = 명확한 케이스가 있는 경우 사용
        //ex) 에러 코드

        int score = 45;
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 65) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        System.out.println("학점 조회 완료");


        //1~7 숫자 하나 변수
        //월화수목금토일
        int week = 4;
        switch (week) {
            case 1:
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7:
                System.out.println("일");
                break;
        }

    }
    }