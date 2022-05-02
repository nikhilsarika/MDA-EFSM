package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data2;

public class StoreData2 extends StoreData{

    @Override
    public void storeData(Data data) {
        Data2 Data2 = (ModelDrivenArchitecture.Data.Data2) data;
        Data2.setId(Data2.getTempP());
        Data2.setPin(Data2.getTempY());
        Data2.setBalance(Data2.getTempA());
    }
}
