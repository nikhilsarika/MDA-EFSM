package ModelDrivenArchitecture.Actions;

public class TooManyAttemptsMsg2 extends  TooManyAttemptsMsg{

    @Override
    public void tooManyAttemptsMsg() {
        System.out.println("TOO MANY LOGIN ATTEMPTS");
    }
}
