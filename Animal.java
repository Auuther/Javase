import java.util.Scanner;
public class Animal{
	private double weight;//����
	private int leg;//�ȵ�����
	private String color;//��ɫ
	private Animal[] animals;//����һ�����飬�����洢��������
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return weight;
	}
	public void setLeg(int leg){
		this.leg=leg;
	}
	public int getLeg(){
		return leg;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	//��ʼ������
	public void initAnimal(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("-----------------�����붯�����Ϣ--------------------");
		animals=new Animal[3];
		int j=1;
		for(int i=0;i<animals.length;i++){
			Animal an=new Animal();
			System.out.println("������"+j+"�������Ϣ:");
			System.out.println("����:");
			double weight=scanner.nextDouble();
			an.setWeight(weight);
			System.out.println("����:");
			int leg=scanner.nextInt();
			an.setLeg(leg);
			System.out.println("��ɫ:");
			String color=scanner.next();
			an.setColor(color);
			animals[i]=an;
			j++;
		}
		//��ӡ������Ϣ
		for(int a=0;a<animals.length;a++){
			Animal animal=animals[a];
			System.out.println("��"+(a+1)+"ֻ�������Ϣ:");
			System.out.println("����: "+animal.getWeight());
			System.out.println("����: "+animal.getLeg());
			System.out.println("��ɫ: "+animal.getColor());
		}
	}
	public static void main(String[] args){
		Animal an=new Animal();
		an.initAnimal();
	}
}