package contohLoop.code;

import java.util.Scanner;

class Soal3 {
    public static long fpb(long inputA, long inputB) {
        if (inputB == 0) return inputA;
        return fpb(inputB, inputA % inputB);
    }    
    
    public static long kpk(long inputA, long inputB) {
        return (inputA * inputB) / fpb(inputA, inputB);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int data = sc.nextInt();
        long res = sc.nextInt();
        
        for (int i = 1; i < data; i++) {
            int test = sc.nextInt();
            res = kpk(res, test);
        }
        
        System.out.println(res);
    }
}