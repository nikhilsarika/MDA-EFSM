package ModelDrivenArchitecture.Actions;

import ModelDrivenArchitecture.Data.Data;
import ModelDrivenArchitecture.Data.Data2;

public class DisplayBalance2 extends DisplayBalance{

    @Override
    public void displayBalance(Data data) {
        Data2 data2 = (Data2) data;
        System.out.println("CURRENT BALANCE IN THE ACCOUNT : "+data2.getBalance());
    }
}
