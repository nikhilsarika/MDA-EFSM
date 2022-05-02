package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;

public class Penalty1 extends Penalty{

    @Override
    public void penalty(Data data) {
        Data1 data1 = (Data1) data;
        data1.setBalance(data1.getBalance()-15);
    }
}
