package com.codeinshort.statemachine.codejam;

import java.util.Scanner;

//https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ff49/000000000043adc7
public class Retype {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int tests = sc.nextInt();
        while(tests > 0){
            tests--;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = sc.nextInt();

            System.out.println("Case #"+counter+": "+findMin(n, k , s));
            counter++;
        }
    }
    static int findMin(int n, int k, int s){

        int op1 = k-1 + (k-s) + (n-s+1);
        int op2 = k + n;

        return Math.min(n + 1, (k-s) + (n-s) + 1) + (k-1);
    }
}
