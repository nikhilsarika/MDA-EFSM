package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;

public class MakeWithdraw1 extends MakeWithdraw{

    @Override
    public void makeWithdraw(Data data) {
        Data1 data1 = (Data1) data;
        data1.setBalance(data1.getBalance()-data1.getTempW());
    }
}
