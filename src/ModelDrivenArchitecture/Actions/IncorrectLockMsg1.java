package ModelDrivenArchitecture.Actions;

public class IncorrectLockMsg1 extends IncorrectLockMsg{

    @Override
    public void incorrectLockMsg() {
        System.out.println("INCORRECT LOCK: ACCOUNT IS ALREADY LOCKED");
    }
}
