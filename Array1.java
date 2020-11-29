package Array;

public class Array1{
    //（1）、给定两个数组a{1,2,3,4} b{5,6,7,8}将两个数组内的元素对应位置互换

    public static void main(String[]args){
/*
		//方式一    交换数组中对应的元素(循环次数好多次  受长度的限制)

		//1.创建两个数组
		int[] a = new int[]{1,2,3,4};
		int[] b = new int[]{5,6,7,8};
		//2.元素对应位置的互换 --- 每一次交换两个数字  for循环四次
		for(int i=0;i<a.length;i++){
			a[i] = a[i]^b[i];
			b[i] = a[i]^b[i];
			a[i] = a[i]^b[i];
		}
		//3.分别输出两个数组中的元素
		//错误表达-->System.out.println(a);
		//错误表达-->System.out.println(b);//hashCode
		for(int c : a){
			System.out.println(c);
		}
		for(int d : b){
			System.out.println(d);
		}
*/

        //方式二    直接交换变量a和b中的数组引用(地址)  循环一次即可搞定  不受长度限制

        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8,9,0};

        int[] x = a;
        a = b;
        b = x;

        for(int v : a){
            System.out.println(v);
        }
        System.out.println("----------");
        for(int v : b){
            System.out.println(v);
        }
    }
}
