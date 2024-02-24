package org.Program;

public class Question_2 {
    public static void main(String[] args) {
    	Question_2 obj = new Question_2();
        obj.printTheSequence(0, 2, 10);
        
        System.out.println(); 
        
        obj.printTheSequence(5, 3, 5);
    }

    public void printTheSequence(int a, int b, int n) {
        int term = a + b;
        System.out.print(term + " ");

        for (int i = 1; i < n; i++) {
            b = b * 2;
            term = term + b;
            System.out.print(term + " ");
        }
    }
}

