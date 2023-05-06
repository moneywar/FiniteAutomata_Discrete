import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        diagram Autoomata = new diagram();
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();
        System.out.println(Autoomata.isFinite(input));
        System.out.println();
        sn.close();
    }
}