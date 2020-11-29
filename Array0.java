package Array;

public class Array0{
    public static void main(String[]args){
        int[] array = new int[50];
        for(int i=0;i<array.length;i++){
            array[i] = i*2+1;
        }
        for(int value : array){
            System.out.println(value);
        }
    }
}
