package chapter13_adstraction.interfaces;
/*
    이 부분에서 고려해야할 점은
    자바는 단일 상속만 가능하기에
    VU/ VD / PB 셋중 하나만 상속 가능한데
    어떻게 3개 전부의 메서드들을 전부 사용하게 작성할수 있을까
 */
public class RemoteController {
    //상속 안 받습니다
    // 필드 선언 -> 이전까지는 java의 기본 자료형만을 사용했지만
    //이번에 처음으로 우리가 직접 정의한 클래스가 자료형이 되는 필드를 적용함
    //     PowerButton powerButton;
    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
//생성자
    public RemoteController(PowerButton powerButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton,
                            ChannelUpButton channelUpButton, ChannelDownButton channelDownButton) {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton= channelUpButton;
    }

    //메서드 구현
    //PowerButten 의 메서드를 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }
    //volumedownbutton의 메서들 구현
    public void onPressedVolumeDownButton(){
        volumeDownButton.ondown();
    }

    public void onPressedVolumeUpButton(){
        volumeUpButton.onup();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onPressed();
    }
    public void onUpVolumeDownButton(){
        volumeUpButton.onPressed();
    }

    public void onPressedChannelDown(){
        channelDownButton.ondown();
    }

    public void onDowndChannelDown(){
        channelDownButton.onPressed();
    }

    public void onPressedChannelUp(){
        channelUpButton.onup();
    }

    public void onUpChannelUp(){
        channelUpButton.onPressed();
    }


}
