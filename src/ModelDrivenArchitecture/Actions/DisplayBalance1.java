package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data1;

public class DisplayBalance1 extends DisplayBalance{

    @Override
    public void displayBalance(Data data) {
        Data1 data1 = (Data1) data;
        System.out.println("CURRENT BALANCE IN THE ACCOUNT : "+data1.getBalance());

    }
}
