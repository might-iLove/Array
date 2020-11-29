package Array;

public class Array{
    public static void main(String[]args){

/*
		int a = 10;
		int b = a;
		b = 100;
		System.out.println(a);//  10
*/


        int[] x = new int[]{10,20,30};
        //栈内存中的小容器  类型定义只能存储这种东西  容器中只能存一份
        // new 关键字  相当于  在堆内存中申请开辟一块新的空间
        //数组在堆内存的空间形态  是一串连续的地址
        //基本类型变量空间存储的是值  传递的就是值      一个改变  另一个不变
        //引用类型变量空间存储的是地址(引用)  传递的就是引用      一个改变  另一个跟着改变
        int[] y = x;
        y[0] = 100;
        System.out.println(x[0]);  //100
    }
}