package _24_Interface;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );


        // 파워 버튼

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton(); // 한번더 실행했을때 꺼짐 - if 문 때문

        // 채널 버튼

        //up
        tvRemoteController.onUpChannelUpButton();
        tvRemoteController.onPressedChannelUpButton();

        //down
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelDownButton();



        // 볼륨 버튼

        //up
        tvRemoteController.onUpVolumeUpButton();
        tvRemoteController.onPressedVolumeUpButton();

        //down
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeDownButton();




    }
}
