package week5;

import java.util.Scanner;

public class Lesson1 {
	public static void main() {//����һ�����У����ֵ��ֵ������Ҫ�����ÿ�����ھ�ֵ������
		//��ʼ��
		Scanner in=new Scanner(System.in);
		int [] A=new int[100];
		int cur=0,sum=0,p=0;
		double aver=0;
		//����׶Σ���-1��Ϊ����
		System.out.println("�����벻����100����������-1��Ϊ���һ������");
		while(cur!=-1){
			cur=in.nextInt();
			A[p++]=cur;
			sum+=cur;
		}//while
		aver=sum/(p+1);
		System.out.println("���к�Ϊ"+sum+"��ֵΪ"+aver);
		//��������д��ھ�ֵ����
		int i=0;
		while(i<p&&A[i]>=aver){
			System.out.println("���ǵ�"+(i+1)+"�����֣�����ֵ��"+A[i]);
		}//while
	}

}
