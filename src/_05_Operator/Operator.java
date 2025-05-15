package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        //연산자

        //대입 연산자
        int num1 = 10; // = : 대입 연산자 - 앞쪽에 대입이 된다
        int num2 = 5;
        // 여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미
        // 수학적인 같다 라는 의미가 아님

        //산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


        //복합 대입 연산자
        num1 += 5;//num1 = num1 + 5 =15
        System.out.println(num1);
        num1 -= 5; //num1 = num1 - 5 =10
        System.out.println(num1);
        num1 *= 2; //num1 = num1 * 2 =20
        System.out.println(num1);
        num1 /= 2; //num1 = num1 / 2 =10
        System.out.println(num1);
        num1 %= 2; //num1 = num1 % 2 =0
        System.out.println(num1);

        //증강 연산자
        int j = 10;
//        System.out.println(j);
        //실행이 된 후에 1증가
//        System.out.println(j++);//코드를 실행하고 나면 바로 1 더해짐 10 => 10 + 1
//        System.out.println(j);//여기서 -1

        //실행이 된 후에 1감소
//        System.out.println(j--);
//        System.out.println(j);

        //실행이 되기 전에 1 증가
//        System.out.println(++j); //11
//        //실행이 되기 전에1 감소
//        System.out.println(--j); //10

        //비교 연산자 => 결과가 항상 boolean 참/거짓둘 중 하나의 값을 출력

        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);//같냐?
        System.out.println(num1 != num2); //! = 문법적 부정 = 같지 않냐

        //논리 연산자 (&(and), |(or), !(부정))
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); // & and 논리 곱 -> 하나라도 false가 있으면 false
        System.out.println(flag1 | flag2); // | or 논리합 -> 하나라도 true가 있으면 true
        System.out.println(flag2 | flag2); // 둘다 false 기때문에 false
        System.out.println(!flag1);// ! 앞에 넣으면 반대로 나옴

        //논리 연산자 조합(&&, ||)
        //&& -> 선조건이 true일 때만 후조건을 실행한다, 선 조건이 false이면 후조건을 실행하지 않는다
        //|| -> 선조건이 true이면 후조건을 실행하지 않는다, 선조건이 false일때만 후조건을 실행한다
        System.out.println(flag1 && flag2); //앞이 false면 무조건 false
        System.out.println(flag1 || flag2); //앞이 true면 무조건 true

        //삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x:y;//x가 y보다 큰가?
        int min = (x < y) ? x:y;//x가 y보다 작은가?
        //이거 뭔가 이상함... 나중에 강의랑 대조 할것

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);

        /*
         *int height = 숫자;
         * 키가 120이상인 경후 탑승 가능하도록 하는 삼항 연산자
         * 가능하면 "탑승가능" 불가능하면 "탑승 불가능"  츨력
         */

        int height = 140;
        String result = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(result);












    }
}
