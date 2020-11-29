package Array;

public class Array6{
    //(6)、给定一个数组a{1,2,3,9,4,5}按照数组中的最大值位置 将数组拆分成两个{1,2,3,}{4,5}
    public static void main(String[]args){

        // 1、需要一个数组
        int[] oldArray = {1,2,3,9,4,5};

        // 2、找寻最大值的索引位置---->为了通过这个位置  确定两个小数组的长度
        int max = oldArray[0];  //数组的第一个元素值
        int index = 0;  //
        for(int i=1;i<oldArray.length;i++){
            if(oldArray[i]>max){
                max = oldArray[i];
                index = i;
            }
        }
        System.out.println("最大值:"+max);
        System.out.println("最大值的位置:"+index);

        // 3、需要两个小数组分别承载元素
        int[] newa = new int[index];
        int[] newb = new int[oldArray.length-index-1];

        // 4、分别将两个小数组填满
        for(int i=0;i<newa.length;i++){
            newa[i] = oldArray[i];
        }
        for(int i=0;i<newb.length;i++){
            newb[i] = oldArray[index+1+i];
        }

        for(int v : newa){
            System.out.println(v);
        }
        System.out.println("-------------");
        for(int v : newb){
            System.out.println(v);
        }
    }
}
