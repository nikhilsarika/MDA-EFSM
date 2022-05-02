package ModelDrivenArchitecture.States;

public class CheckPin extends State{


    public CheckPin() {
        this.id=2;
    }

    @Override
    public void incorrectPin(boolean aboveMax) {
        outputProcessor.incorrectPinMsg();
        if (aboveMax){
            outputProcessor.tooManyAttemptsMsg();
        }

    }

    @Override
    public void correctPinBelowMin() {
        outputProcessor.displayMenu();
    }

    @Override
    public void correctPinAboveMin() {
        outputProcessor.displayMenu();
    }

    @Override
    public void logout() {
        super.logout();
    }
}
