package _25_Casting.Control;

public class CentralControl {

    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) { // -> 암시적으로 업캐스팅
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }

        deviceArray[0] = device;
        System.out.println(device.getClass().getSimpleName());
   }

    public int checkEmpty() {
        // 배열의 빈자리 인덱스 찾기
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i; // 빈잘 찾았을때
            }

        }
        return -1;


    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if (device == null) {
                System.out.println("장치가 등록 되어있지 않은 슬롯입니다.");
                continue;
            }

            device.onPower();

        }
    }

    public void powerOff() {
        //for
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null){
                System.out.println("장치가 등록 되어있지 않은 슬롯입니다.");
            }

        }
    }

    public void performSpecificMethod() {
        for (Power device : deviceArray){
            if(device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.rollMouse();
            } else if (device instanceof LEDLight) {
                LEDLight ledlight =(LEDLight) device;
                ledlight.colorChange();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.offPower();
            } else if (device instanceof Tv) {
                Tv tv = (Tv) device;
                tv.upChannel();
            } else if (device instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.cameraButton();
            }
        }
    }
}
