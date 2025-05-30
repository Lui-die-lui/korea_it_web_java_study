package _30_Singleton.AppConfig;

import lombok.Data;
//Getter, Setter, toSrting, EqualsAndHashCode, Required
@Data
public class AppConfig {

    private static AppConfig instance;

//    private AppConfig () {} // 생성자 막기

    private String apiKey;
    private String appMode;

    private AppConfig () {
        this.apiKey = "DEFAULT-KEY";
        this.appMode = "PRODUCTION";
    }

    public static AppConfig getInstance() {
        if (instance == null ) { // 정적변수에 인스턴스가 있는지 확인
            instance = new AppConfig(); // 없다면 최초 1회 객체 생성
        }
        return instance;
    }




}
