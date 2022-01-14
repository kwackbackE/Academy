package jan14.Ex84_InterfaceHowToUse;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio OFF");
    }

    @Override
    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now Audio's Volume: "+volume);
    }
}
