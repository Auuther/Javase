package work;

import java.util.Random;

public class PetShop {
	private String name;
	private Pet[] pets = new Pet[10];
	private int count = 0;

	public PetShop(String name) {
		this.name = name;
		addPet(new Dog("С��", "��", 2, "��������"));
		addPet(new Cat("����", "ĸ", 4, 80));
		addPet(new Dog("С��", "��", 1, "�л���԰Ȯ"));
		addPet(new Cat("¶��", "ĸ", 6, 85));
		addPet(new Dog("andy", "��", 1, "����"));
		addPet(new Cat("ĬĬ", "ĸ", 2, 50));
		addPet(new Cat("Сǿ", "��", 8, 89));
		addPet(new Dog("СС", "��", 2, "��������"));
		addPet(new Dog("big", "��", 2, "�л���԰Ȯ"));
	}

	// �ж��Ƿ����û������Ʒ��
	public boolean hasDogKind(String kind) {
		for (Pet pet : pets) {
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public int size() {
		return count;
	}

	// �������� private boolean addPet(Pet pet);//˽�н���������
	private boolean addPet(Pet pet) {
		if (count >= pets.length) {
			return false;
		}
		pets[count] = pet;
		count++;
		return true;
	}

	// �չ����� public boolean purchasePet(Pet pet);//�����չ����﷽�����ڸ÷������� �������� addPet
	// ������
	public boolean purchasePet(Pet pet) {
		return this.addPet(pet);
	}

	// ���򹷵ķ���
	public Pet buyDog(String kind) {
		int kindNum = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					kindNum++;
				}
			}
		}
		int[] kindIndex = new int[kindNum];// ������� kindƷ�ֵ�dog���±�λ��
		int k = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				boolean equals = d.getKind().equals(kind);
				if (equals) {
					kindIndex[k++] = i;
				}
			}
		}
		Random r = new Random();
		int nextInt = r.nextInt(kindIndex.length);
		int i = kindIndex[nextInt];

		Pet result = pets[i];// ȷ������ȥ�ĳ���
		capaticyConfirm(i);
		return result;
	}

	// �������ɹ������鳤�ȼ���
	private void capaticyConfirm(int index) {
		// 5 6
		int tag = index;
		while (tag < count - 1) {
			pets[tag] = pets[tag + 1];
			tag++;
		}
		pets[--count] = null;
	}

	// 5. ��˿�չʾ���г�����Ϣ public void showPets()
	public void showPets() {
		for (int i = 0; i < count; i++) {
			pets[i].show();
		}
	}

	// �ж��Ƿ����û�Ҫ�����è
	public boolean hasCatLove(int love) {
		for (Pet pet : pets) {
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;
				boolean equals = love - c.getLove() >= -10 && love - c.getLove() <= 10;
				if (equals) {
					return true;
				}
			}
		}
		return false;

	}

	// ����è�ķ���
	public Pet buyCat(int love) {

		int kindNum = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;

				boolean equals = love - c.getLove() >= -10 && love - c.getLove() <= 10;
				if (equals) {
					kindNum++;
				}
			}
		}
		int[] kindIndex = new int[kindNum];// ������� love��cat���±�λ��
		int k = 0;
		for (int i = 0; i < pets.length; i++) {
			Pet pet = pets[i];
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;
				boolean equals = love - c.getLove() >= -10 && love - c.getLove() <= 10;
				if (equals) {
					kindIndex[k++] = i;
				}
			}
		}

		Random r = new Random();
		int nextInt = r.nextInt(kindIndex.length);
		int i = kindIndex[nextInt];

		Pet result = pets[i];// ȷ������ȥ�ĳ���
		capaticyConfirm(i);
		return result;
	}

}
