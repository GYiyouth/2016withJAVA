import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static final int MIN_VALUE = 2 ^(-31);
	public static void main(String[] args) {
		// ����
		int[] arr1 = new int [10];
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i]=(int) (Math.random()*100); // ������������ţ��ܹؼ�����Ȼȫ0000
		System.out.println(arr1[i]);
	
		}
		int []arr2 = Arrays.copyOfRange(arr1, 0, 3); // ���鸴��
		System.out.println("����arr2����ǰ����Ԫ�أ�����");
		for(int ret:arr2)
			System.out.print(ret+" ");
		System.out.println("");
		
		/*����ʼ*/
		// ֱ�Ӳ�������,�������
		{
			int temp = 0, p = 1, i=p;
			for( ; p<arr1.length ; p++){
				temp = arr1[p];
				for( i=p; i>0 && temp<arr1[i-1]; i--)
					arr1[i] = arr1[i-1];
				arr1[i]=temp;
			}
			System.out.println("��ֱ�Ӳ������򡿵õ�");
			for(int q:arr1)
				System.out.print(q+" ");
			System.out.println("");
			
		}
		// ð�����򣬽������
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
			System.out.println("��ð�����򡿽��������");
			for(int q : arr1 )
			System.out.print(q+" ");
			System.out.println("");
		}
		// �������򣬽������
		{
			// ��˵�ɣ�
		}
		// ArrayList 
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("�������֣��������������Ž���");
		boolean ctn = true;
		while( ctn ){ // ����
			try{
				arr3.add(in.nextInt());
			}
			catch(Exception e){
				ctn = false;
			}
		} // while��������
		for( int i : arr3)
			System.out.print(i+" ");
		Collections.sort(arr3 ); // JAVA�Դ���������,����
		System.out.println("\n"+arr3);
	} // main
} // class main
