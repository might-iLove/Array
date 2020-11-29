package Array;

import java.util.Scanner;

public class Array12{
    public static void main(String[]agrs){
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本周是第几周，我将为您的班级更换座位表");
        int week = input.nextInt();
        for(int i=1;i<=week%4;i++){
            int[] x = array[0];
            array[0] = array[1];
            array[1] = array[2];
            array[2] = array[3];
            array[3] = x;
        }
        for(int[] arr : array){
            for(int v : arr){
                System.out.print(v+"\t");
            }
            System.out.println();
        }
    }
}
