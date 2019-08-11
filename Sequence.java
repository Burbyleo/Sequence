package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

int lo,hi,base;

Scanner num = new Scanner(System.in);

System.out.println("Enter base, lower bound and upper bound:");
if (!num.hasNextInt()){
    System.out.println("Invalid input!");
    System.exit(1);
}

base = num.nextInt();
        if (!num.hasNextInt()){
            System.out.println("Invalid input!");
            System.exit(1);
        }

lo = num.nextInt();
        if (!num.hasNextInt()){
            System.out.println("Invalid input!");
            System.exit(1);
        }
hi = num.nextInt();

        if (lo > hi || lo < 0 || hi < 0  || base <2){
            System.out.println("Invalid input!");
            System.exit(1);
        }

int digits =0, zeros=0,maxzeros=0,final_zeros=0;

for (int i = lo; i <=hi; i++){
    int a =i;
    do {
        if (a % base == 0){
            zeros++;
            maxzeros++;
        }
        a /= base;
        digits++;
        if (a % base != 0){
            if (maxzeros >= final_zeros){
                final_zeros = maxzeros;
            }
            maxzeros = 0;
        }
    } while (a >= 1);

    if(zeros == 1){final_zeros = 1;}
    if((base == 2) && (final_zeros== 2)){ final_zeros = 1;}

}
        System.out.println("What you would like to see:");
        System.out.println("1) Digits in total.");
        System.out.println("2) Zeros in total.");
        System.out.println("3) Maximum number of zeros in a row.");

        if (!num.hasNextInt()){
            System.out.println("Invalid input!");
            System.exit(1);
        }

int what_to_do = num.nextInt();

switch (what_to_do){
    case 1:{
        System.out.println("Digits : " + digits);
        System.exit(0);
    }
    case 2:{
        System.out.println("Zeros : " + zeros);
        System.exit(0);
    }
    case  3:{
        System.out.println("Zeros in a row : " + final_zeros);
        System.exit(0);
    }
    default:
        System.out.println("Invalid input!");
}
    }
}
