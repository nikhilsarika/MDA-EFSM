package ModelDrivenArchitecture.States;

public class Suspend extends State{
    public Suspend() {
        this.id =5;
    }

    @Override
    public void balance() {
        outputProcessor.displayBalance();
    }

    @Override
    public void activate() {

    }

    @Override
    public void close() {

    }
}
