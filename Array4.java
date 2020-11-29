package Array;

public class Array4{
    //(4)、给定一个数组a{1,3,5,7,9,0,2,4,6,8}寻找数组中的最大值和最小值(极值问题)

    public static void main(String[]args){
        int[] a = {1,3,5,7,9,0,2,4,6,8};

        // 1.创建一个变量    当做本子---->记录信息
        int min = a[0];
        int max = a[0];

        // 2.挨个寻找数组中的元素    与变量中的元素进行比较
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("数组中的最小值为"+min);
        System.out.println("数组中的最大值为"+max);
    }
}
