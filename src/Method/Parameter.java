package Method;

public class Parameter {
    public static void power(int number) {
        //거듭제곱을 하는 메소드
        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + " 입니다");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + " 입니다");
    }

    public static void getAvg(int a, int b, int c) {
        a = 80;
        b = 90;
        c = 100;
            System.out.println("세 값의 평균은" + ((a + b + c)/3) + "입니다.");
        }

        public  static  void  isEven(int a) {
        String result = (a % 2 == 0) ? "짝수임" : "홀수임";
            System.out.println(result);
        }


    public static void main(String[] args) {
        //Parameter
        //매개변수, 전달값
        int num = 4;
        power(num);//전달하는 자료형만 일치 시켜주면 됨
        power(3);

        powerByExp(2,4);


        //세개의 정수를 전달하여서 평균을 출력하는 메소드
        //getAvg(80, 90, 100);

        //정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
        //단, 삼항연산자를 쓸 것
        //isEven(2)

    }
}
