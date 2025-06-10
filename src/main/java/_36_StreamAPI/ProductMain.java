package _36_StreamAPI;

//"삼성 갤럭시북3 프로", 1850000,
//"삼성 갤럭시북 이온", 1350000,
//"삼성 갤럭시탭 S9", 950000,
//"삼성 갤럭시 S24 울트라", 1590000
//"애플 맥북에어 M2", 1690000,
//"애플 맥북프로 M3", 2490000,
//"애플 아이패드 에어 5세대", 929000
//"애플 아이폰 15 프로", 1550000,
//"LG 그램 17", 2190000,
//"LG 울트라PC", 1140000

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = Arrays.asList(
                new Product("삼성 갤럭시북3 프로", 1850000),
                new Product("삼성 갤럭시북 이온", 1350000),
                new Product("삼성 갤럭시탭 S9", 950000),
                new Product("삼성 갤럭시 S24 울트라", 1590000),
                new Product("애플 맥북에어 M2", 1690000),
                new Product("애플 맥북프로 M3", 2490000),
                new Product("애플 아이패드 에어 5세대", 929000),
                new Product("애플 아이폰 15 프로", 1550000),
                new Product("LG 그램 17", 2190000),
                new Product("LG 울트라PC", 1140000)
        );



    }
}
