package Array;

public class Array5{
    //(5)、给定两个数组a{1,2,3} b{4,5}合并两个数组(创建一个新的数组---->5个长度)

    public static void main(String[]args){

        // 1、创建两个数组
        int[] a = {1,2,3};
        int[] b = {4,5};

        // 2、因为数组长度一旦确定  不能再次改变  需要创建一个新的数组
        int[] newArray = new int[a.length+b.length];


        //思路二：想要将新数组填满
        for(int i=0;i<a.length+b.length;i++){
            if(i<a.length){
                newArray[i] = a[i];
            }else{
                newArray[i] = b[i-a.length];
            }
        }
        for(int v : newArray){
            System.out.println(v);
        }



        //思路一：分别将a和b数组中的元素存入新数组内
/*
		// 3、分别将a和b数组中的元素存入新数组内
		for(int i=0;i<a.length;i++){    //将a数组中所有元素存入新数组内
			newArray[i] = a[i];
		}    //newArray----->{1,2,3,0,0}
		for(int i=0;i<b.length;i++){
			newArray[a.length+i] = b[i];
		}
		for(int v : newArray){    //将b数组中所有元素存入新数组后面的位置
			System.out.println(v);
		}
*/
    }
}
