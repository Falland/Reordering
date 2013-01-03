package com.quizes;

public class ReorderArrayQuiz {

    Object[] reorder(Object[] src) {
        int half = src.length / 2;
        for (int i = 0; i < half - 1; i++) {
            for (int j = half-i-1; j <= half+i-1; j+=2) {
                Object temp = src[j];
                src[j] = src[j + 1];
                src[j + 1] = temp;
            }
        }
        return src;
    }

    public static void main(String[] args) {
        Object[] arr = {1,2,3,4,5,6,"a", "b", "c", "d", "e","f"};
        ReorderArrayQuiz reorder = new ReorderArrayQuiz();
        arr = reorder.reorder(arr);
        printArr(arr);
    }

    private static void printArr(Object[] arr) {
        for (Object el : arr) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }
}
