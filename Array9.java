package Array;

public class Array9{
    //(9)、数组元素的排序(冒泡  选择  插入  快速  希尔  堆排序  桶排序  归并排序  递归……)
    //int[] array = {5,2,3,1,4};//升序排列---->{1,2,3,4,5}本质元素位置互换   **交换位置的条件**(重点)

    //冒泡排序的算法//

    public static void main(String[]args){
        int[] array = {5,2,3,1,4};
        for(int i=1;i<5;i++){
            for(int j=4;j>=i;j--){
                if(array[j]>array[j-1]){
                    int x = array[j];
                    array[j] = array[j-1];
                    array[j-1] = x;
                }
            }
        }
        for(int v : array){
            System.out.println(v);
        }
    }
}
