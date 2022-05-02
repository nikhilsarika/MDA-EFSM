package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data2;

public class MakeWithdraw2 extends MakeWithdraw{

    @Override
    public void makeWithdraw(Data data) {
        Data2 data2 = (Data2) data;
        data2.setBalance(data2.getBalance()-data2.getTempW());
    }
}
