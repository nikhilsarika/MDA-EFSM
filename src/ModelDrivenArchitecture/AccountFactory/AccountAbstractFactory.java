package ModelDrivenArchitecture.AccountFactory;

import ModelDrivenArchitecture.Actions.*;
import ModelDrivenArchitecture.Data.Data;


public interface AccountAbstractFactory {

    Data getData();
    StoreData getStoreData();
    IncorrectIdMsg getIncorrectIdMsg();
    IncorrectPinMsg getIncorrectPinMsg();
    TooManyAttemptsMsg getTooManyAttemptsMsg();
    DisplayMenu getDisplayMenu();
    MakeDeposit getMakeDeposit();
    DisplayBalance getDisplayBalance();
    PromptForPin getPromptForPin();
    MakeWithdraw getMakeWithdraw();
    Penalty getPenalty();
    IncorrectLockMsg getIncorrectLockMsg();
    IncorrectUnlockMsg getIncorrectUnlockMsg();
    NoFundsMsg getNoFundsMsg();


}
