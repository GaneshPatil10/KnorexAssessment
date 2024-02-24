package org.Program;

public class Question_4 {
    public static void main(String[] args) {
    	Question_4 obj = new Question_4();
    	obj.printPrisonerToWarn(5, 2, 1); 
    	obj.printPrisonerToWarn(5, 2, 2); 
    }

    public void printPrisonerToWarn(int n, int m, int s) {
       
        int finalPosition = (s + m - 1) % n;
        if (finalPosition == 0) {
            finalPosition = n;
        }

        System.out.println(finalPosition);
    }
}

