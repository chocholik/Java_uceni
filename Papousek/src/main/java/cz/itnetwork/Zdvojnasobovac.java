package cz.itnetwork.zdvojnasobovac;
import java.util.Arrays;
import java.util.Scanner;

public class Zdvojnasobovac {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte číslo k zdvojnásobení:");
        int cislo = scanner.nextInt();
        cislo = cislo * 2;
        System.out.println("Dvojnasobek je: " + cislo);
     }
}

