package ModelDrivenArchitecture.States;

public class Locked extends State{
    public Locked() {
        this.id= 8;
    }

    @Override
    public void unlock() {
        super.unlock();
    }

    @Override
    public void incorrectUnlock() {
        outputProcessor.incorrectUnlockMsg();
    }
}
