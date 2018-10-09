package pl.dawidpalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        Teen teen = new Teen(a, b);

        teen.print();

    }
}
