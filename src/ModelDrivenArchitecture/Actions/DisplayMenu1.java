package ModelDrivenArchitecture.Actions;

public class DisplayMenu1 extends DisplayMenu{

    @Override
    public void displayMenu() {
        System.out.println("TRANSACTION MENU:");
        System.out.println("\tBALANCE");
        System.out.println("\tWITHDRAW");
        System.out.println("\tDEPOSIT");
        System.out.println("\tLOCK");
        System.out.println("\tUNLOCK");
    }
}
