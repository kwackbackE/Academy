package jan14.Ex84_InterfaceHowToUse;

public class RemoteControllerExample {
    public static void main(String[] args) {
        /*RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();*/
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
