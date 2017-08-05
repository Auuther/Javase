package work;

import java.util.Scanner;

public class Main {
	// ��������
	static Scanner sc = new Scanner(System.in);
	PetShop petShop = new PetShop("����");

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	// ��ʼ����
	private void start() {
		while (true) {
			System.out.println(petShop.getName() + "˵������Ҫ����1��������Ҫ���۳��2�����鿴���г��3����������㿴��Ȼ���뿪��0����");
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				this.buyPetView();
				break;
			case 2:
				this.purchasePetView();
				break;
			case 3:
				petShop.showPets();
				break;

			default:
				System.out.println("�ټ�...");
				return;
			}
		}

	}

	// �չ�����
	private void purchasePetView() {
		int choise = inputInt("��ĳ����ǣ�����1����è��2��");
		switch (choise) {
		case 1:
			purchaseDogView();
			break;
		case 2:
			purchaseCatView();
			break;

		default:
			break;
		}
	}

	// �չ�è
	private void purchaseCatView() {
		// 1. ���è������˵����ܶ�Ϊ���٣�(0-100)
		// 2. ��ʲô�Ա��è��
		// 3. è������
		// 4. èȡʲô���֣�
		int love = inputInt("���è������˵����ܶ�Ϊ���٣�(0-100)");
		String sex = inputStr("��ʲô�Ա��è��");
		int age = inputInt("è������");
		String name = inputStr("èȡʲô���֣�");
		Cat cat = new Cat(name, sex, age, love);
		boolean purchasePet = petShop.purchasePet(cat);
		System.out.println(purchasePet ? "�չ��ɹ���" : "�չ�ʧ�ܣ�");
	}

	// �չ���
	private void purchaseDogView() {
		// 1. ��ʲôƷ�ֵĹ���
		// 2. ��ʲô�Ա�Ĺ���
		// 3. ����������
		// 4. ��ȡʲô���֣�
		String kind = inputStr("��ʲôƷ�ֵĹ���");
		String sex = inputStr("��ʲô�Ա�Ĺ���");
		String name = inputStr("��ȡʲô���֣�");
		int age = inputInt("����������");
		Dog dog = new Dog(name, sex, age, kind);
		boolean purchasePet = petShop.purchasePet(dog);
		System.out.println(purchasePet ? "�չ��ɹ���" : "�չ�ʧ�ܣ�");
	}

	// �������
	private void buyPetView() {
		switch (inputInt("��Ҫ��ʲô�������1����è��2��")) {
		case 1:
			buyDogView();
			break;
		case 2:
			buyCatView();
			break;

		default:
			break;
		}
	}

	/**
	 * ����cat������
	 */
	private void buyCatView() {
		while (true) {
			int love = inputInt("��Ҫ�������ܶȵ�è�䣿(0-100)");
			boolean hasCatLove = petShop.hasCatLove(love);
			if (!hasCatLove) {
				System.out.println("��ѡ������ܶȱ���û�У����������룡");
				continue;
			}
			Pet buyCat = petShop.buyCat(love);
			buyCat.show();
			return;
		}
	}

	/**
	 * ����dog������
	 */
	private void buyDogView() {
		while (true) {
			String kind = inputStr("ҪʲôƷ�ֵĹ���");
			boolean hasDogKind = petShop.hasDogKind(kind);
			if (!hasDogKind) {
				System.out.println("��ѡ���Ʒ�ֱ���û�У����������룡");
				continue;
			}
			Pet buyDog = petShop.buyDog(kind);
			buyDog.show();
			return;
		}
	}

	// ����int����
	public int inputInt(String tip) {
		System.out.println(tip);
		return sc.nextInt();
	}

	// ����String����
	public String inputStr(String tip) {
		System.out.println(tip);
		return sc.next();
	}
}
