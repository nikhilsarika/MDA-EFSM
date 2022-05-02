package ModelDrivenArchitecture;

import ModelDrivenArchitecture.AccountFactory.Account1ConcreteFactory;
import ModelDrivenArchitecture.AccountFactory.Account2ConcreteFactory;
import ModelDrivenArchitecture.AccountFactory.AccountAbstractFactory;
import ModelDrivenArchitecture.Data.Data;

public class OutputProcessor {

    private AccountAbstractFactory abstractFactory;
    private Data data;
    public OutputProcessor(AccountAbstractFactory accountAbstractFactory) {
        this.abstractFactory = accountAbstractFactory;
        this.data = accountAbstractFactory.getData();
    }

    public void storeData(){
        abstractFactory.getStoreData().storeData(data);
    }

    public void incorrectIdMsg(){
        abstractFactory.getIncorrectIdMsg().incorrectIdMsg();
    }

    public void incorrectPinMsg(){
        abstractFactory.getIncorrectPinMsg().incorrectPinMsg();
    }

    public void tooManyAttemptsMsg(){
        abstractFactory.getTooManyAttemptsMsg().tooManyAttemptsMsg();
    }

    public void displayMenu(){
        abstractFactory.getDisplayMenu().displayMenu();
    }

    public void makeDeposit(){
        abstractFactory.getMakeDeposit().makeDeposit(data);
    }

    public void displayBalance(){
        abstractFactory.getDisplayBalance().displayBalance(data);
    }

    public void promptForPin(){
        abstractFactory.getPromptForPin().promptForPin();
    }

    public void makeWithdraw(){
        abstractFactory.getMakeWithdraw().makeWithdraw(data);
    }

    public void penalty(){
        abstractFactory.getPenalty().penalty(data);
    }

    public void incorrectLockMsg(){
        abstractFactory.getIncorrectLockMsg().incorrectLockMsg();
    }

    public void incorrectUnlockMsg(){
        abstractFactory.getIncorrectUnlockMsg().incorrectUnlockMsg();
    }

    public void noFundsMsg(){
        abstractFactory.getNoFundsMsg().noFundsMsg();
    }


}
