package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        //1~9단까지 출력하십시오
        //1 X 3  = 3
        for (int i = 1 ; i < 10 ; i++) { // 단
            for (int j = 1; j < 10 ; j++) { // 곱해지는 값 '뒷쪽'
                System.out.println(i + "X" + j + "=" + i*j);

            }
            System.out.println();
        }


    }
}
