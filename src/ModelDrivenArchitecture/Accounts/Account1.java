package ModelDrivenArchitecture.Accounts;

import ModelDrivenArchitecture.AccountFactory.AccountAbstractFactory;
import ModelDrivenArchitecture.Data.Data1;

public class Account1 extends Account{

    Data1 accountData;

    public Account1(int accountId, AccountAbstractFactory accountAbstractFactory) {
        super(accountId, accountAbstractFactory);
        this.accountData = (Data1) accountAbstractFactory.getData();
    }

    public void open(int p, int y, int a){
        accountData.setTempA(a);
        accountData.setTempP(p);
        accountData.setTempY(y);
        mdaContext.open();
    }

    public void login(int y){
        if( y == accountData.getId()){
            mdaContext.login();
        }
        else{
            mdaContext.incorrectLogin();
        }
    }

    public void logout(){
        mdaContext.logout();
    }

    public void pin(int x){
        if (x == accountData.getPin()){
            if (accountData.getBalance()>100){
                mdaContext.correctPinAboveMin();
            }
            else {
                mdaContext.correctPinBelowMin();
            }
        }
        else {
            mdaContext.incorrectPin(1);
        }
    }

    public void deposit(int d){
        accountData.setTempD(d);
        mdaContext.deposit();
        if (accountData.getBalance()>100){
            mdaContext.aboveMinBalance();
        }
        else{
            mdaContext.belowMinBalance();
        }
    }

    public void withdraw(int w){
        accountData.setTempW(w);
        mdaContext.withdraw();
        if (accountData.getBalance()>100){
            mdaContext.aboveMinBalance();
        }
        else{
            mdaContext.withdrawBelowMinBalance();
        }
    }

    public void balance(){
        mdaContext.balance();
    }


    public void lock(int x){
        if (accountData.getPin() ==x){
            mdaContext.lock();
        }
        else{
            mdaContext.incorrectLock();
        }
    }

    public void unlock(int x){
        if (accountData.getPin() ==x){
            mdaContext.unlock();
            if (accountData.getBalance()>100){
                mdaContext.aboveMinBalance();
            }
            else{
                mdaContext.belowMinBalance();
            }
        }
        else{
            mdaContext.incorrectUnlock();
        }
    }
}
