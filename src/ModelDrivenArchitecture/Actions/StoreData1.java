package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;

public class StoreData1 extends StoreData{

    @Override
    public void storeData(Data data) {
        Data1 data1 = (Data1) data;
        data1.setId(data1.getTempP());
        data1.setPin(data1.getTempY());
        data1.setBalance(data1.getTempA());
    }
}
