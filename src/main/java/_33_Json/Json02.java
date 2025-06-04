package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.internal.GsonTypes;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;
        // java 객체 -> Json
        User user = new User (
                "Lsg",
                "9876",
                "lsg05h@naver.com",
                "lee",
                "30"
        );

        System.out.println("user 객체 : " + user);
        userJson = gson.toJson(user); //  -> user객체를 string 형태
        System.out.println(user);

        userJson = gsonBuilder.toJson("gsonBuilder 사용 : " + user); // user객체를 json형태로 예쁘게 변환

        //JsonObject -> json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode" , "20250001");
        jsonObject1.addProperty("studentName" , "lsg");
        jsonObject1.addProperty("studentYear" , "2");
        jsonObject1.addProperty("score" , "96.7");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 사용 : " + jsonObject1);
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println("gsonBuilder 사용 : " + studentJson);

        // Map -> Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode","NR3457D-KD456G");
        map1.put("productName","삼성 갤럭시북 프로 5");

        System.out.println("gson 사용 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        //json -> Map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);

        //json -> User
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        //json -> jsonObject -> json과 jsonObject 같은 형태가 아니다
        //studentJson의 자료형은 String -> jsonObject 의 자료형 JsonObject
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
