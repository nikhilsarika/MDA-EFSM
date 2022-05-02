package ModelDrivenArchitecture.Actions;

public class DisplayMenu2 extends DisplayMenu{

    @Override
    public void displayMenu() {
        System.out.println("TRANSACTION MENU:");
        System.out.println("\tBALANCE");
        System.out.println("\tWITHDRAW");
        System.out.println("\tDEPOSIT");
        System.out.println("\tSUSPEND");
        System.out.println("\tACTIVATE");
        System.out.println("\tCLOSE");
    }
}
