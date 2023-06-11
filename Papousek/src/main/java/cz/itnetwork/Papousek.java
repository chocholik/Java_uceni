package cz.itnetwork.papousek;
import java.util.Scanner;
public class Papousek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Ahoj, jsem virtuální papoušek Lóra, rád opakuji!");
        System.out.println("Napiš něco: ");
        String vstup;
        vstup = scanner.nextLine();
        String vystup;
        vystup = vstup + ", " + vstup + "!";
        System.out.println(vystup);
    }
}
