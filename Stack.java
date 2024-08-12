package stack;
import java.util.Scanner;
class StackOperation{
    int max=30;
    private int[] a=new int[max];
    int top;

    StackOperation(){
        top=-1;
    }

    public void push(int value){
        if(top==max-1)
            throw new IndexOutOfBoundsException("STACK OVERFLOW");
        a[++top]=value;
    }

    public int pop(){
        if(top==-1)
            throw new IndexOutOfBoundsException("STACK UNDERFLOW");
       return a[top--];
    }

    int peek(){
        return a[top];
    }

}

public class Stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StackOperation so=new StackOperation();
        so.push(20);
        so.push(22);
        so.push(44);
        System.out.println("displayed the pop value" + so.pop());
        System.out.println("displayed the peek value" + so.peek());

    }
}
