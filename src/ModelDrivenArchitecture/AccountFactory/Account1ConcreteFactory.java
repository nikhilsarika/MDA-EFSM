package ModelDrivenArchitecture.AccountFactory;

import ModelDrivenArchitecture.Actions.*;
import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;

public class Account1ConcreteFactory implements AccountAbstractFactory {

    static Data data = new Data1();

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public StoreData getStoreData() {
        return new StoreData1();
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        return new IncorrectIdMsg1();
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        return new IncorrectPinMsg1();
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        return new TooManyAttemptsMsg1();
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1();
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        return new MakeDeposit1();
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        return new DisplayBalance1();
    }

    @Override
    public PromptForPin getPromptForPin() {
        return new PromptForPin1();
    }

    @Override
    public MakeWithdraw getMakeWithdraw() {
        return new MakeWithdraw1();
    }

    @Override
    public Penalty getPenalty() {
        return new Penalty1();
    }

    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return new IncorrectLockMsg1();
    }

    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return new IncorrectUnlockMsg1();
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        return new NoFundsMsg1();
    }
}
