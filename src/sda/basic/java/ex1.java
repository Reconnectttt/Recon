package sda.basic.java;

public class ex1 {
    public static void main(String[] args) {
        displaywordInHexFormat();
        displaywordInBinaryFormat();
        displaywordInDecFormat();
    }

    private static void displaywordInDecFormat() {
        char s = 83; // w trybie dec sa same liczby
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();

    }

    private static void displaywordInBinaryFormat() {
        char s = 0b0101_0011; // w trybie bianrnym jest 0b
        char d = 0b0100_0100;
        char a = 0b0100_0001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }
    private static void displaywordInHexFormat() {
        char s = 0x53; // w trybie hexaogalnym jest 0x
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
        System.out.println();
    }
}
