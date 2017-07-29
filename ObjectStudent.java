import java.util.Scanner;
public class Student{
	private  String name;//����
	private  int age;//����
	private  double score;//����
	//����ȫ�ֵı���
	private Student[] students;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setScore(double score)
	{
		this.score=score;
	}
	public double getScore(){
		return score;
	}
	
	//��ʼ��ѧ��
	public void initStudent(){
		Scanner scanner=new Scanner(System.in);
		students=new Student[3];
		System.out.println("--------����3��ѧ������Ϣ--------");
		int j=1;
		for(int i=0;i<students.length;i++){
		
			Student stu=new Student();	
			
			System.out.println("�����["+j+"]��ѧ������Ϣ:");
			System.out.println("����:");
			stu.setName(scanner.next());	
			
			System.out.println("����:");
			stu.setAge(scanner.nextInt());	
			
			System.out.println("����:");
			stu.setScore(scanner.nextDouble());	
			
			students[i]=stu;		
			j++;
		}
		//��ӡ���
		for(int a=0;a<students.length;a++){
			Student stu=students[a];
			System.out.println("��["+(a+1)+"]��ѧ����������"+stu.getName());
			System.out.println("��["+(a+1)+"]��ѧ�������䣺"+stu.getAge());
			System.out.println("��["+(a+1)+"]��ѧ���ķ�����"+stu.getScore());
			System.out.println("----------------------------------------");
		}
	}
	
	//�ܷ�
	public double sumScore(){
		double sumScore=0.0;		
		for(int a=0;a<students.length;a++){
			Student stu=students[a];
			sumScore+=stu.getScore();
		}
		return sumScore;
	}
	
	//ƽ����
	public double avgScore(){
		return sumScore()/students.length;
	}

	//���ֵ
	public double max(){
		double max=students[0].getScore();		
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()>max){
				max=students[a].getScore();
			}
		
		}
		return max;
		
	}
	//���ֵ��ѧ��
	public Student maxStudent(){
		double max=students[0].getScore();	
		int index=-1;
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()>max){
				max=students[a].getScore();
				index=a;
			}
		
		}
		return students[index];
		
	}
	//��Сֵ
	public double min(){
		double min=students[0].getScore();		
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()<min){
				min=students[a].getScore();
			}
		
		}
		return min;
		
	}
	//��Сֵ��ѧ��
	public Student minStudent(){
		double min=students[0].getScore();	
		int index=-1;
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()<min){
				min=students[a].getScore();
				index=a;
			}else{
				min=students[0].getScore();
				index=0;
			}
		
		}
		return students[index];
		
	}
	//����
	public void sort(){
		Student st=new Student();
		for(int i=0;i<students.length-1;i++){
			for(int j=i+1;j<students.length-1;j++){
				if(students[i].getScore() > students[j].getScore()){
					st=students[i];
					students[i]=students[j];
					students[j]=st;
				}
			}
		}
		
		for(Student s: students){
			System.out.print("������"+s.getName()+" ");
			System.out.print("���䣺"+s.getAge()+"  ");
			System.out.print("������"+s.getScore()+"  ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Student stu=new Student();
		//��ʼ��ѧ��
		stu.initStudent();
		//�ܷ�
		System.out.println("�ܷ֣� "+stu.sumScore());
		//ƽ����
		System.out.println("ƽ����: "+stu.avgScore());
		//�������ֵ
		System.out.println("���ֵ: "+stu.max());
		//�������ֵ��ѧ����Ϣ
		System.out.println("�������ֵ��ѧ������: "+stu.maxStudent().getName());
		//������Сֵ
		System.out.println("��Сֵ: "+stu.min());
		//������Сֵ��ѧ����Ϣ
		System.out.println("������Сֵ��ѧ������: "+stu.minStudent().getName());
		//����
		System.out.println("�������� ");
		stu.sort();
		
		
	}
}
