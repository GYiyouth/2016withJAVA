import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static final int MIN_VALUE = 2 ^(-31);
	public static void main(String[] args) {
		// 数组
		int[] arr1 = new int [10];
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i]=(int) (Math.random()*100); // 这后面的这个括号，很关键，不然全0000
		System.out.println(arr1[i]);
	
		}
		int []arr2 = Arrays.copyOfRange(arr1, 0, 3); // 数组复制
		System.out.println("数组arr2复制前三个元素，如下");
		for(int ret:arr2)
			System.out.print(ret+" ");
		System.out.println("");
		
		/*排序开始*/
		// 直接插入排序,结果升序
		{
			int temp = 0, p = 1, i=p;
			for( ; p<arr1.length ; p++){
				temp = arr1[p];
				for( i=p; i>0 && temp<arr1[i-1]; i--)
					arr1[i] = arr1[i-1];
				arr1[i]=temp;
			}
			System.out.println("【直接插入排序】得到");
			for(int q:arr1)
				System.out.print(q+" ");
			System.out.println("");
			
		}
		// 冒泡排序，结果降序
		{
			int front =0, rear =arr1.length, p = 0;
			while(front<rear){
				int max = MIN_VALUE;
				for(int i=front ; i<rear ; i++){
					if(arr1[i] > max){
						max = arr1[i];
						p = i;
					}
				}
				arr1[p] = arr1[front] ;
				arr1[front++] = max ;
			}
			System.out.println("【冒泡排序】降序输出是");
			for(int q : arr1 )
			System.out.print(q+" ");
			System.out.println("");
		}
		// 快速排序，结果升序
		{
			// 再说吧！
		}
		// ArrayList 
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("输入数字，以任意其他符号结束");
		boolean ctn = true;
		while( ctn ){ // 输入
			try{
				arr3.add(in.nextInt());
			}
			catch(Exception e){
				ctn = false;
			}
		} // while构造数组
		for( int i : arr3)
			System.out.print(i+" ");
		Collections.sort(arr3 ); // JAVA自带的排序函数,升序
		System.out.println("\n"+arr3);
	} // main
} // class main
