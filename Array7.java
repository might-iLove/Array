package Array;

public class Array7{
    //(7)、给定一个数组a{1,2,3,0,0,4,5,0,6,0,7}去掉数组中的0元素(创建一个新数组 非零去除)

    public static void main(String[]args){

        //1、需要一个数组
        int[] oldArray = {1,2,3,0,0,4,5,0,6,0,7};

        //2、找寻原数组中的非零元素个数---->才能确定新数组的长度
        int count = 0;
        for(int i=0;i<oldArray.length;i++){
            if(oldArray[i]!=0){
                count++;
            }
        }
        System.out.println("非零元素个数为："+count);

        //3、创建一个新的数组  装原数组中的非零元素
        int[] newArray = new int[count];

        //4、将原数组中的非零元素挑出来  存入新数组中
        int index = 0; //控制新书桌的索引变化
        for(int i=0;i<oldArray.length;i++){
            if(oldArray[i]!=0){
                newArray[index] = oldArray[i];
                index++;
            }
        }

        //5、旧数组没有用啦  删掉
        oldArray = null;//即 将oldArray变量空间的引用(地址)删除
        //oldArray数组 没有任何的引用指向   会被视为垃圾
        //垃圾回收器 GC ------>帮我们回收

        //6、验证新数组
        for(int v : newArray){
            System.out.println(v);
        }
    }
}
