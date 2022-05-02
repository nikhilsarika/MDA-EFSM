package ModelDrivenArchitecture.States;

public class Idle extends State{


    public Idle() {
        this.id=1;
    }


    @Override
    public void login() {
        outputProcessor.promptForPin();
    }

    @Override
    public void incorrectLogin() {
        outputProcessor.incorrectIdMsg();
    }
}
