package Array;

import java.util.Scanner;

public class Array10{
    //(10)、用户的登录认证(用数组当做小数据库 存值 用户认证)


/*
	1.需要一个存储真实账号、密码的地方(小数组----充当数据库)
	2.需要用户输入用户名(账号)和密码
	3.比对
		先比账号   账号是唯一存在的(主键primary key约束)

		登录成功(账号和密码都正确)
		密码错误
		用户名不存在
*/


    public static void main(String[]args){

        //1、需要数组来存储  所有的账号和密码(相当于小数据库)
        String[] userBox = {"陈宇鹏","王雪","覃意琪"};
        int[] passwordBox = {4901,520,666};

        //2、需要用户输入
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号");
        String user = input.nextLine();
        System.out.println("请输入密码");
        int password = input.nextInt();
        boolean x = false;//标记
        //3、比较账号、密码
        for(int i=0;i<userBox.length;i++){
            if(userBox[i].equals(user)){//账号存在
                if(passwordBox[i]==password){//密码正确
                    System.out.println("登录成功");
                    x = true;
                }
                break;
            }
        }
        if(!x){
            //用户名 或 密码 有一个不正确 需要输出
            //b标记的值与最初的一样不能改
            System.out.println("用户名或密码错误");
        }
    }
}

