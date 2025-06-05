package _33_Json;

//Book 객체 → JSON 문자열:
//{"isbn":"978-1234567890","title":"자바의 정석","author":"남궁성","price":"38000","publisher":"도우출판"}
//
//JSON → Map:
//{isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판}
//
//Map → Pretty JSON:
//{
//  "isbn": "978-1234567890",
//  "title": "자바의 정석",
//  "author": "남궁성",
//  "price": "38000",
//  "publisher": "도우출판"
//}


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor // 전체 다 있어야 하기 때문
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 변수 만들어놓고 가져다 씀

        String bookJson = null;

        Book book = new Book (
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );

        System.out.println();

        // Book 객체 -> JSON 문자열
        // String jsonBook = gson.toJson(book);

        System.out.println("Book(객체) : " + book);
        bookJson = gson.toJson(book);
        System.out.println("gson만 사용 : " + bookJson);

        System.out.println();

        System.out.println("Json -> Map");
        Map<String, String> map1 = gson.fromJson(bookJson, Map.class);
        // 전부 String으로 들어가기 때문에
        // Map 객체를 map1로 - Map type에 하나의 객체를 넣는다.
        System.out.println(map1);

        System.out.println();

        String prettyJsonFromMap = gsonBuilder.toJson(map1);
        System.out.println(prettyJsonFromMap);

//        System.out.println("Book(Map -> gsonBuilder) : " + gsonBuilder.toJson(map1));
//        System.out.println(map1);

        System.out.println();


        //Json -> Book
        Book parsedBook = gson.fromJson(bookJson,Book.class);
        System.out.println("JSON -> Book 객체");
        System.out.println(parsedBook);




    }
}
