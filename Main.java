import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        diagram Autoomata = new diagram();
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter number (0,1) : ");
        String input = sn.nextLine();
        
        boolean isAccept = Autoomata.isFinite(input);
        if(isAccept) System.out.println("Accept");
        else System.out.println("Reject");
        System.out.println();
        sn.close();
    }
}