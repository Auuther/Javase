import java.util.Random;
public class TestArrays1{
	public static void main(String[] args){ 
		//�������ά���鸳ֵ,��ӡ���ÿ��Ԫ��
		Random random=new Random();
		int rand=0;//�洢�����
		int[][] arrays=new int[3][4];//������ά����
		//�����鸳ֵ
		for(int i=0;i<arrays.length;i++){
			for(int j=0;j<arrays[i].length;j++){
				rand=random.nextInt(100);//��0-100���������һ��������
				arrays[i][j]=rand;
			}
		}
		//��ӡ���(����forѭ��)
		System.out.println("����forѭ��: ");
		for(int i=0;i<arrays.length;i++){
			for(int j=0;j<arrays[i].length;j++){
				System.out.print(arrays[i][j]+" ");
			}
		}
		//��ӡ���(������ǿforѭ��)
		System.out.println();//����
		System.out.println("����forѭ��: ");
		for(int[] a:arrays){
			for(int b:a){
				System.out.print(b+" ");
			}
		}
	}
}