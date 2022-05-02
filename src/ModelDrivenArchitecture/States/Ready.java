package ModelDrivenArchitecture.States;

public class Ready extends State{

    public Ready() {
        this.id=3;
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
        outputProcessor.makeWithdraw();
    }

    @Override
    public void noFunds() {
        outputProcessor.noFundsMsg();
    }

    @Override
    public void lock() {

    }

    @Override
    public void incorrectLock() {
        outputProcessor.incorrectLockMsg();
    }

    @Override
    public void suspend() {

    }
}
