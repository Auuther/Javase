import java.util.Scanner;

public class Arrays{

	public static void main(String[] args){ 
		// int[] a=new int[11];
		// �������� ����������Ԫ����ͬ���滻Ϊ0
		
		int[] arrays={2,3,4,1,2,3,5};
		int temp=0;//��ʱ�洢����
		//������
		for(int i=0;i<arrays.length-1;i++){
			for(int j=i+1;j< arrays.length;j++){
				if(arrays[i] > arrays[j]){
					temp=arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
				}
			}
		}
		//������õ�������бȽ� ��������ֵΪ0
		for(int i=0;i<arrays.length-1;i++){
			for(int j=i+1;j< arrays.length;j++){
				if(arrays[i] == arrays[j]){
					arrays[i]=0;
					arrays[j]=0;
				}
			}
		}
		//������
		for(int i=0;i<arrays.length;i++){
			System.out.print(arrays[i]+" ");
		}
		
	}
}