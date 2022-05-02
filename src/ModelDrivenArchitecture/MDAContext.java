package ModelDrivenArchitecture;

import ModelDrivenArchitecture.AccountFactory.AccountAbstractFactory;
import ModelDrivenArchitecture.States.*;

import java.util.ArrayList;
import java.util.List;

public class MDAContext {

    private int attempts;
    private  static final List<State> stateList = getStateList();
    private State currentState = stateList.get(0);

    public MDAContext(AccountAbstractFactory accountAbstractFactory) {
        this.attempts =0;
        currentState.setOutputProcessor(new OutputProcessor(accountAbstractFactory));
    }

    public void open(){
        currentState.open();

        if (currentState.getId() ==0){
            currentState = stateList.get(1);
        }
    }
    public void login(){
        this.attempts =0;
        currentState.login();
        if (currentState.getId() ==1){
            currentState = stateList.get(2);
        }
    }
    public void incorrectLogin(){
        currentState.incorrectLogin();
    }
    public void incorrectPin(int i){
        if (currentState.getId()==2){
            if (attempts<i){
                currentState.incorrectPin(false);
                attempts++;
            }
            else if (attempts ==i){
                currentState.incorrectPin(true);
                currentState = stateList.get(1);
            }
        }

    }
    public void correctPinBelowMin(){
        System.out.println("current state :"+currentState.getId());
        currentState.correctPinBelowMin();
        if (currentState.getId()==2){
            currentState = stateList.get(6);
        }
    }
    public void correctPinAboveMin(){
        currentState.correctPinAboveMin();
        if (currentState.getId()==2){
            currentState = stateList.get(3);
        }
    }
    public void deposit(){
        currentState.deposit();
        if (currentState.getId()==6){
            currentState = stateList.get(4);
        }
    }
    public void belowMinBalance(){
        if (currentState.getId()==4){
            currentState = stateList.get(6);
        }
    }
    public void aboveMinBalance(){
        if (currentState.getId()==4){
            currentState = stateList.get(3);
        }
    }
    public void logout(){
        if (currentState.getId()==2 || currentState.getId()==3 ||currentState.getId()==6){
            currentState = stateList.get(1);
        }
    }
    public void balance(){
        currentState.balance();

    }
    public void withdraw(){
        currentState.withdraw();
        if (currentState.getId()==3){
            currentState = stateList.get(4);
        }
    }
    public void withdrawBelowMinBalance(){
        currentState.withdrawBelowMinBalance();
        if (currentState.getId()==4){
            currentState = stateList.get(6);
        }
    }
    public void noFunds(){
        currentState.noFunds();
    }
    public void lock(){
        if (currentState.getId()==3 ||currentState.getId()==6){
            currentState = stateList.get(8);
        }
    }
    public void incorrectLock(){
        currentState.incorrectLock();
    }
    public void unlock(){
        currentState.unlock();
        if (currentState.getId()==8){
            currentState = stateList.get(4);
        }
    }
    public void incorrectUnlock(){
        currentState.incorrectUnlock();
    }
    public void suspend(){
        currentState.suspend();
        if (currentState.getId()==3){
            currentState = stateList.get(5);
        }
    }
    public void activate(){
        currentState.activate();
        if (currentState.getId()==5){
            currentState = stateList.get(3);
        }
    }
    public void close(){
        currentState.close();
        if (currentState.getId()==5){
            currentState = stateList.get(7);
        }
    }
    
   

    public static List<State> getStateList() {
        List<State> staticList = new ArrayList<>();
        staticList.add(new Start());
        staticList.add(new Idle());
        staticList.add(new CheckPin());
        staticList.add(new Ready());
        staticList.add(new StateS1());
        staticList.add(new Suspend());
        staticList.add(new Overdrawn());
        staticList.add(new Stop());
        staticList.add(new Locked());
        return staticList;
    }
}
