import java.util.Random;
public class TestArrays{
	public static void main(String[] args){ 
		//�������50������������ŵ����飬����ܺͣ�ƽ��ֵ�����ֵ����Сֵ
		Random random=new Random();
		int rand=0;
		int[] arrays=new int[50];
		int max=0;//���ֵ
		int min=0;//��Сֵ
		int sum=0;//�ܺ�
		double avg=0.0;//ƽ��ֵ
		
		//��������
		 System.out.println("������ɵ���Ϊ�� ");
		for(int i=0;i<50;i++){
			rand=random.nextInt(50);//��0-50���������һ��������
			arrays[i]=rand;
			System.out.print(rand+" ");
		}
		//���ܺ�
		 for(int i=0;i<arrays.length;i++){
			sum+=arrays[i];
		 }
		 //�����ֵ����Сֵ
		 max=arrays[0];//�����һ��ֵΪ���ֵ
		 for(int i=0;i<arrays.length;i++){	
				if(arrays[i]>max){
					 max=arrays[i];
				}else{
					min=arrays[i];
			 }
		 }
		 
		 avg=sum/arrays.length;//����ƽ��ֵ
		  System.out.println();//����
		 System.out.println("�ܺͣ� "+sum);
		 System.out.println("ƽ��ֵ�� "+avg);
		 System.out.println("���ֵ�� "+max);
		 System.out.println("��Сֵ�� "+min);
		
	}
}