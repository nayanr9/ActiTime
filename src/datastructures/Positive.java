package datastructures;

import java.util.Scanner;

public class Positive {
    public static void main(String args[] ) throws Exception {
        int countp=0, countn=0, countz=0;
        int array[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<6;i++){
        	array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                countp++;
            }else if(array[i]==0){
                countz++;
            }else{
                countn++;
            }
           }
        if (countz>countn && countz>countp){
            System.out.println("The array has more zeros");
        }else if(countp>countn && countp>countz){
            System.out.println("The array has more positive numbers");
        }else{
        	System.out.println("The array has more negative numbers");
        }
        sc.close();
    }
}