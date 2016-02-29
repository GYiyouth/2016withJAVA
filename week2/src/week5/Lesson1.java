package week5;

import java.util.Scanner;

public class Lesson1 {
	public static void main() {//输入一个数列，求均值总值，并按要求输出每个大于均值的数的
		//初始化
		Scanner in=new Scanner(System.in);
		int [] A=new int[100];
		int cur=0,sum=0,p=0;
		double aver=0;
		//输入阶段，以-1作为结束
		System.out.println("请输入不多于100个整数，以-1作为最后一个数字");
		while(cur!=-1){
			cur=in.nextInt();
			A[p++]=cur;
			sum+=cur;
		}//while
		aver=sum/(p+1);
		System.out.println("数列和为"+sum+"均值为"+aver);
		//输出数列中大于均值的数
		int i=0;
		while(i<p&&A[i]>=aver){
			System.out.println("这是第"+(i+1)+"个数字，他的值是"+A[i]);
		}//while
	}

}
