package org.Program;

public class Question_3 {
    public static void main(String[] args) {
    	Question_3 obj = new Question_3();
        int[] arr1 = {0, -1, 2, -3, 1};
        int t1 = -2;
        System.out.println(obj.isThereASum(arr1, t1)); 

        int[] arr2 = {1, -2, 1, 0, 5};
        int t2 = 0;
        System.out.println(obj.isThereASum(arr2, t2)); 
    }

    public boolean isThereASum(int[] arr, int t) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == t) {
                    return true;
                }
            }
        }

        return false;
    }
}


