package jan13.ExInterface;

public class Telvision implements ReomteControl{
    private int volume;

    public void turnOn(){
        System.out.println("TV ON");
    }
    public void turnOff() {
        System.out.println("TV OFF");
    }

    public void setVolume(int volume) {
        if(volume>ReomteControl.MAX_VOLUME) {
            this.volume = ReomteControl.MAX_VOLUME;
        } else if (volume<ReomteControl.MIN_VOLUME) {
            this.volume = ReomteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now TV's Volume: "+volume);
    }

}
