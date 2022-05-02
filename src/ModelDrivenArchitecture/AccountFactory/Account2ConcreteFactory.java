package ModelDrivenArchitecture.AccountFactory;

import ModelDrivenArchitecture.Actions.*;
import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data2;

public class Account2ConcreteFactory implements AccountAbstractFactory {

    static Data data = new Data2();
    @Override
    public Data getData() {
        return data;
    }

    @Override
    public StoreData getStoreData() {
        return new StoreData2();
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        return new IncorrectIdMsg2();
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        return new IncorrectPinMsg2();
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        return new TooManyAttemptsMsg2();
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2();
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        return new MakeDeposit2();
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        return new DisplayBalance2();
    }

    @Override
    public PromptForPin getPromptForPin() {
        return new PromptForPin2();
    }

    @Override
    public MakeWithdraw getMakeWithdraw() {
        return new MakeWithdraw2();
    }

    @Override
    public Penalty getPenalty() {
        return null;
    }

    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return null;
    }

    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return null;
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        return new NoFundsMsg2();
    }
}
