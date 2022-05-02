package ModelDrivenArchitecture.States;

import ModelDrivenArchitecture.OutputProcessor;

public class State {


    protected static OutputProcessor outputProcessor;
    protected int id;
    public State() {
    }

    public OutputProcessor getOutputProcessor() {
        return outputProcessor;
    }

    public void setOutputProcessor(OutputProcessor outputProcessor) {
        this.outputProcessor = outputProcessor;
    }

    public void open(){}
    public void login(){}
    public void incorrectLogin(){}
    public void incorrectPin(boolean aboveMax){}
    public void correctPinBelowMin(){}
    public void correctPinAboveMin(){}
    public void deposit(){}
    public void belowMinBalance(){}
    public void aboveMinBalance(){}
    public void logout(){}
    public void balance(){}
    public void withdraw(){}
    public void withdrawBelowMinBalance(){}
    public void noFunds(){}
    public void lock(){}
    public void incorrectLock(){}
    public void unlock(){}
    public void incorrectUnlock(){}
    public void suspend(){}
    public void activate(){}
    public void close(){}


    public int getId() {
        return id;
    }
}
