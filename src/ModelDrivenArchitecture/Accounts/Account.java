package ModelDrivenArchitecture.Accounts;

import ModelDrivenArchitecture.AccountFactory.AccountAbstractFactory;
import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.MDAContext;

public class Account {

    protected static MDAContext mdaContext;
    protected static Data data;
    private int accountId;
    private static AccountAbstractFactory accountAbstractFactory;


    public Account(int accountId, AccountAbstractFactory accountAbstractFactory) {
        this.mdaContext = new MDAContext(accountAbstractFactory);
        this.data = accountAbstractFactory.getData();
        this.accountId = accountId;
        this.accountAbstractFactory = accountAbstractFactory;
    }
}
