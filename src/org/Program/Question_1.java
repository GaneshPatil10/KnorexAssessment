package org.Program;

public class Question_1 {
	public static void main(String args[]) {
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;

        int reversed1 = reverseNumber(x1);
        int reversed2 = reverseNumber(x2);
        int reversed3 = reverseNumber(x3);

        System.out.println("Reversed x1: " + reversed1);
        System.out.println("Reversed x2: " + reversed2);
        System.out.println("Reversed x3: " + reversed3);
    }

    public static int reverseNumber(int x) {
        int reversed = 0;
        int rem;

        while (x != 0) {
            rem = x % 10;
            reversed = reversed * 10 + rem;
            x = x / 10;
        }

        return reversed;
    }
}
