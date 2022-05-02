package ModelDrivenArchitecture.States;

public class Overdrawn extends State{
    public Overdrawn() {
        this.id= 6;
    }


    @Override
    public void deposit() {
        outputProcessor.makeDeposit();
    }

    @Override
    public void logout() {

    }

    @Override
    public void balance() {
        outputProcessor.displayBalance();
    }

    @Override
    public void withdraw() {
        outputProcessor.noFundsMsg();
    }

    @Override
    public void lock() {

    }

    @Override
    public void incorrectLock() {
        outputProcessor.incorrectLockMsg();
    }
}
