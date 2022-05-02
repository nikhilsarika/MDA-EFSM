package ModelDrivenArchitecture.States;

public class StateS1 extends State{
    public StateS1() {
        this.id= 4;
    }

    @Override
    public void belowMinBalance() {

    }

    @Override
    public void aboveMinBalance() {

    }

    @Override
    public void withdrawBelowMinBalance() {
        outputProcessor.penalty();
    }
}
