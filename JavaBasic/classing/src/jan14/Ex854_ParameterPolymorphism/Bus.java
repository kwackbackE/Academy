package jan14.Ex854_ParameterPolymorphism;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus GO");
    }
}
