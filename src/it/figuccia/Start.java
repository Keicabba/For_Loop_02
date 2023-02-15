package it.figuccia;

public class Start {
    public static void main(String[] args) {
        for (int a = 0, b = 1, c = 0; c <= 10; c = a + b) {
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
