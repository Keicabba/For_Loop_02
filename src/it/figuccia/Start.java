package it.figuccia;

public class Start {
    public static void main(String[] args) {
        for (int i = 0, a = 0, b = 1, c = 0; i < 10; i++) {
            a = b;
            b = c;
            System.out.println(c);
            c = a + b;
        }
    }
}
