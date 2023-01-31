package W2L2.Assignment;

import W2L2.ArrayStack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {
    String input;
    Stack<String> strStack = new Stack<>();

    public ReverseStringStack(String inp){
        input = inp;
        fillStack();
    }
    public void fillStack(){
        String[] val = input.split(" ");
        for (int i = 0; i < val.length; i++) {
            strStack.push(val[i]);
        }
    }

    public String reverse(){
        StringBuilder result = new StringBuilder("[");
        while (!strStack.empty()){
            result.append(strStack.pop() + " ");
        }
        return result.toString();
    }
    public void reverse1(){
        while(!strStack.empty()){
            System.out.print(strStack.pop() +" ");
        }
    }


    public static void main(String[] args) {
        ReverseStringStack rev1 = new ReverseStringStack("I like Java and other programming languages");
        System.out.println(rev1.reverse());
        rev1.reverse1();

    }



}
