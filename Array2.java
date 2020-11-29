package Array;

public class Array2{
    //(2)、给定一个数组a{1,2,3,4,5,6}将这个数组中的元素对应互换位置

    public static void main(String[]args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        for(int i = 0;i<array.length/2;i++){
            int x = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i] = x;
        }
        for(int v : array){
            System.out.println(v);
        }
    }
}
