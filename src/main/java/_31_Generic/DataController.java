package _31_Generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터 : ","LSG",30,3.14); // 메세지 + 데이터 조합
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<String>("이름 : ","LSG"); // 뒤 <>안 String은 생략 가능
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 : " , 30 );
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율 :", 3.14);
        System.out.println(responseData3);

        Date now = new Date();
        // ctrl + space

        ResponseData<Date> nowData = new ResponseData<>("현재 날짜 : ",now);
        System.out.println(nowData);

        // product 패키지
        // ProductController.java , Product.java
        // 상품 정보,  => 상품명(productName), 상품정보(productInfo)
        // Product<> String
        // Product<> Double
        // Product<> Boolean



    }
}
