package com.myjavapractice.loopingstatement;

public class LoopingExamples {
	public static void main(String[] args) {
       LoopingExamples obj = new LoopingExamples();
        obj.testForLoop(5);
    }

    public void testForLoop(int input){

        for(int i=0; i<input; i++) {
            System.out.println(i);
        }

    }

    public void testWhileLoop(int input){
        int j =1;
        while (j<input){
            System.out.println(j);
            j++;
        }
    }

    public void testDoWhileLoop(int input){
        int i = 2;
        do {
            System.out.println(i);
            i++;
        } while(i<input);
    }
}


