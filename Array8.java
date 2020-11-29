package Array;

public class Array8{
    //(8)、创建一个数组 存储2-100之间的素数(质数)
    public static void main(String[]args){

/*
	//思路一：空间占用小 执行效率慢
	//0.通过一个几千次循环找寻一个----count
	//1.创建一个数组  长度(刚好 没有一个空间多余)
	//2.通过几千次循环找寻素数  将素数存入数组内

		//0.找寻2-100之间素数的个数---->确定数组的长度
		int count = 0;//用来记录素数的个数
		for(int num=2;num<=100;num++){
			boolean x = false;//标识 用来记录最初的状态
			for(int i=2;i<=num/2;i++){
				if(num%i==0){//如果有整除的数字 证明num不是素数
					x = true;//如果满足条(找到整除 证明不是素数 改变标识)
					break;
				}
			}
			if(x==false){//如果标识与最初的一致 证明循环内的if从来没有执行过    !x <====> x==false
				count++;
			}
		}
		System.out.println("素数的个数为:"+count);

		//1.创建一个数组  存素数
		int[] PrimeNumber = new int[count];
		//2.找寻2-100之间的素数  将找到的素数存入数组内
		int index = 0;//创建一个新的变量  记录素数数组的索引变化
		for(int num=2;num<=100;num++){
			boolean x = false;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					x = true;
					break;
				}
			}
			if(x==false){
				PrimeNumber[index] = num;
				index++;
			}
		}
		//3.输出最终的数字验证一下
		for(int v : PrimeNumber){
			System.out.println(v);
		}
*/


        //思路二：执行效率高 空间占用大
        //0.创建一个足够长的数组
        //1.通过几千次循环找素数  将素数存入数组内
        //2.将存入素数的数组  后面部分0元素除掉

        int[] primeNumberArray = new int[50];
        int index =0;
        for(int num = 2;num<=100;num++){
            boolean x = false;
            for(int i = 2;i<=num/2;i++){
                if(num%i==0){
                    x = true;
                    break;
                }
            }
            if(!x){
                primeNumberArray[index] = num;
                index++;
            }
        }

        int[] newArray = new int[index];
        int count = 0;
        for(int i=0;i<primeNumberArray.length;i++){
            if(primeNumberArray[i]!=0){
                newArray[count] = 	primeNumberArray[i];
                count++;
            }
        }

        for(int v : newArray){
            System.out.println(v);
        }
    }
}
