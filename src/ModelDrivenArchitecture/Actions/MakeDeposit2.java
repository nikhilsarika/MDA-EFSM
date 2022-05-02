package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;
import ModelDrivenArchitecture.Data.Data2;

public class MakeDeposit2 extends MakeDeposit{

    @Override
    public void makeDeposit(Data data) {
        Data2 data2 = (Data2) data;
        data2.setBalance(data2.getBalance()+ data2.getTempD());
    }
}
