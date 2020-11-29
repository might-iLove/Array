package Array;

public class Array11{
    public static void main(String[]args){
        //声明----初始化(静态)
        int[][] array =  new int[][]{{1,2},{3,4,5,6},{7,8,9}};

        //访问数组内的元素----index
		/*int value = array[0][0];//前面标识小数组位置  后面表示小数组中元素中的位置
		System.out.println(value);//1
		*/


        //数组的遍历或轮询
        //方法一
        for(int i=0;i<array.length;i++){//遍历每一个小数组中的元素
            int[] arr = array[i];
            for(int j=0;j<arr.length;j++){
                int value = array[i][j];
                System.out.print(value+"\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //数组的遍历或轮询
        //方法二
        for(int[] arr : array){
            for(int value : arr){
                System.out.print(value+"\t");
            }
            System.out.println();
        }
    }
}
