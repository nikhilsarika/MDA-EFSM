package ModelDrivenArchitecture.Accounts;

import ModelDrivenArchitecture.AccountFactory.AccountAbstractFactory;
import ModelDrivenArchitecture.Data.Data2;

public class Account2 extends Account{

    Data2 accountData;

    public Account2(int accountId, AccountAbstractFactory accountAbstractFactory) {
        super(accountId, accountAbstractFactory);
        this.accountData = (Data2) accountAbstractFactory.getData();
    }

    public void OPEN(int p,int y, float a){
        accountData.setTempA(a);
        accountData.setTempP(p);
        accountData.setTempY(y);
        mdaContext.open();
    }

    public void PIN(int x){
        if (x == accountData.getPin()){
            mdaContext.correctPinAboveMin();
        }
        else {
            mdaContext.incorrectPin(2);
        }
    }

    public void DEPOSIT(float d){
        accountData.setTempD(d);
        mdaContext.deposit();
    }

    public void WITHDRAW(float w){
        accountData.setTempW(w);

        if (accountData.getBalance()>0){
            mdaContext.withdraw();
            mdaContext.aboveMinBalance();
        }
        else{
            mdaContext.noFunds();
        }
    }

    public void BALANCE(){
        mdaContext.balance();
    }

    public void LOGIN(int y){
        if( y == accountData.getId()){
            mdaContext.login();
        }
        else{
            mdaContext.incorrectLogin();
        }
    }

    public void LOGOUT(){
        mdaContext.logout();
    }

    public void suspend() {
        mdaContext.suspend();
    }
    public void activate () {
        mdaContext.activate();
    }
    public void close () {
        mdaContext.close();
    }
}
