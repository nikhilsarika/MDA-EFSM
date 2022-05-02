package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;

public class MakeDeposit1 extends MakeDeposit{

    @Override
    public void makeDeposit(Data data) {
        Data1 data1 = (Data1) data;
        data1.setBalance(data1.getBalance()+ data1.getTempD());
    }
}
