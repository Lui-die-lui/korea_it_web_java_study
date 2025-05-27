package _24_Interface;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private  VolumeUpButton volumeUpButton;
    private  VolumeDownButton volumeDownButton; // 5개 멤버 변수

    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    } // AllarguesConstructor...?

    public  void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed(); // 파워버튼 접근 메소드 private 이기때문
    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onUp();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }





}
