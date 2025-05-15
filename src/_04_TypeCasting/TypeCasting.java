package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting

        //정수에서 실수로
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt); //scoreint를 float로 실수로 바꿔줌
        System.out.println((double) scoreInt); //scoreint를 double로 실수로 바꿔줌
        System.out.println(scoreInt); //재할당이 아닌 출력만 했기 때문에 변수에 영향 없음

        //실수에서 정수
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);//실수에서 정수로 형변환

        double scoreDouble = 88.5;
        System.out.println((int)scoreDouble);//실수에서 정수로 형변환

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 +(int) 55.3F;
        System.out.println(sum2);

        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동 형변환)

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형변환)뒤로 갈 수록 더 넓은 범위 가능

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        //숫자에서 문자열로
        String strNum1 = String.valueOf(55); //첫번째 방법
        strNum1 = Integer.toString(55);
        System.out.println(strNum1);

        //double에서 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Float .toString(88); //이거 아님 나중에 강의 다시보기
        System.out.println(strNum2);

        //중간에 하나 놓침


        //문자열을 숫자로 "123" =< 123
        int i = Integer.parseInt("123");
        System.out.println(i);
        double d = Double.parseDouble("123.45");
        System.out.println(d);


        //놓침

        //i = Intager.parseInt("숫자");
        // System 놓침















   }
}

