package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회


        String[] countries = {"Hungary" , "Croatia" , "Slovenia" , "Austria" , "Austria" , "Czech"};
        // 반복문 for문을 통해 배열 순회
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(countries[i]);
//        }
//
//        for (int i = 0; i < countries.length ; i++) { // 변수의 길이, 할당량의 크기
//            System.out.println(countries[i]);
//        }

        //enhanced for (for-each) 향상된 for문
        for (String country : countries) { // String country : countries(String값임) 같은 변수값을 사용해야함 countries에 있는 배열 하나씩 다 넣고 출력
            //상자(오)에서 하나씩 꺼내서(왼) 배열(아래 sout)한다고 보면 됨
            System.out.println(country);
        }















    }
}
