package datastructures;

import java.util.Scanner;

public class MyStackStatic {
	private int maxSize, top;
	private String[] stackArray;
	public MyStackStatic(int size){
	    maxSize = 0;
	    stackArray = new String[maxSize];
	    top = -1;
	}
	public void push(String s){
		stackArray[++top]=s;
	}
	public String pop(){
		return stackArray[top--];
	}
	public String peek(){
		String s;
		if(top!=-1){
			s = stackArray[top];
		}
		else
		{
			s = "Peek: Stack is empty"; 
		}
		return s;
	}
	
	public boolean stackFull(){
		return (top == maxSize - 1);
	}
	
	public boolean stackEmpty(){
		return (top== -1);
	}

	public static void main(String[] args) {
		int n=5;
		Scanner sc = new Scanner(System.in);
		MyStackStatic stack = new MyStackStatic(n);
		if(!stack.stackFull()){
			for (int i=0; i<n ; i++)
			stack.push(sc.nextLine());
		}
		else{
			System.out.println("Stack is full");
		}
		for (int i=0; i<n;i++){
			if(!stack.stackEmpty()){
				String topItem = stack.pop();
				System.out.println(topItem);
				}
			else{
				System.out.println("Pop: Stack is empty");
				}
			}
		System.out.println(stack.peek());
		sc.close();
	}

}
