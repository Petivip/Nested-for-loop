import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = myVar.nextInt();


        System.out.println();
        for (int x = 1; x <= num; x++) {
            for(int i=0; i<x;i++) {
                System.out.print(Integer.toString(x));
            }
            System.out.println();
        };
    }}
