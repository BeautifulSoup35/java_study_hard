package chapter13_adstraction.interfaces;

public class AirconditionerController {
    private TemparatureDownBoutton temparatureDownBoutton;
    private TemparatureUpBoutton temparatureUpBoutton;
    private PowerButton powerButton;

    public AirconditionerController(TemparatureDownBoutton temparatureDownBoutton,
                                    TemparatureUpBoutton temparatureUpBoutton, PowerButton powerButton) {
        this.temparatureDownBoutton = temparatureDownBoutton;
        this.temparatureUpBoutton = temparatureUpBoutton;
        this.powerButton = powerButton;
    }

    public void airpressed(){
        System.out.print("에어컨의 ");
        powerButton.onPressed();
    }
    public void temparatureDown(){
        temparatureDownBoutton.onPressed();
    }
    public void powerTemparatureDown(){
        temparatureDownBoutton.ondown();
    }
    public void temparatureUp(){
        temparatureUpBoutton.onPressed();
    }
    public void PowerTemparatureUp(){
        temparatureUpBoutton.onup();
    }



}
