package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {


        //이중 반복문

        //네모 별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****


        for (int i = 0; i < 5; i++) { // 세로줄
            for (int j = 0; j < 5; j++) { // 가로로 별찍기
                System.out.print("*");
            }
            System.out.println();// 줄바꿈
        }

        // 별 삼각형 찍기
        //*
        //**
        //***
        //****
        //*****
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 5; j++) {
                System.out.print(".");
            }
            System.out.println();
        }


        //*****
        //****
        //***
        //**
        //*

        // 10 ~ 1 까지 거꾸로 출력
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
//
//        for (int i = 5; i >= 1; i--) { //5번 반복 5 4 3 2 1
//            for (int j = 1; j < i; j--) { //1개찍 감소 - 후에 적용되는 값 i = 5, 4, 3, 2, 1 로 작아질때마다
//                System.out.print("*"); // 확인 이상함




    /*
    SSSS* i = 0, j 4번 j < 4
    SSS** i = 1, j 3번 j < 3
    SS*** i = 2, j 2번 j < 2
    S****
    *****
     */

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 4 - i ; j++) {
                System.out.print("S");
            }

            for (int j = 0; j < i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

