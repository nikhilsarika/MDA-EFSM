package ModelDrivenArchitecture.States;

public class Start extends State{



    public Start() {
        this.id=0;
    }

    public void open(){
        outputProcessor.storeData();
    }
}
