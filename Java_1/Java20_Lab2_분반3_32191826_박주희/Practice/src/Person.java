import java.util.Arrays;
import java.util.Scanner;

public class Person{
    private String name;
    private int age;
	public Person() { 
		this("", 0); 
	}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) { 
		this.name = name; 
	}
    public void setAge(int age) { 
		this.age = age; 
	}
    public String getName() { 
		return name; 
	}
    public int getAge() { 
		return age; 
	}
    public void print() { 
		System.out.printf("Person Name=%s Age=%d\n", name, age); 
	}
    public String toString() { 
		return "Person Name=" + name + " Age=" + age; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pArray = new Person[2];
		// ���� Person ��ü�� �ϳ��� ������ �� for������ ������ ����� ���
		// ���������� �Էµ� �����ͷ� ��� �����Ͱ��� ġȯ��
		Person p = new Person();
		for (int i = 0; i < 2; i++) {
		    System.out.print("Enter Person name : ");
		    Scanner input = new Scanner(System.in);
		    p.setName(input.nextLine()); // �Է�����
		    System.out.print("Enter Person age [int] : ");
		    p.setAge(input.nextInt()); // �Է�����
		    p.print();
		    pArray[i] = p; // ����Ʈ�� �� ��� ���Ҵ� ������ p
		}
		System.out.println("pArray : " + Arrays.toString(pArray));

		Person[] pArray1 = new Person[2];
		// �Ʒ��� ���� for�� �ȿ� Person p = new Person()�Ͱ���
		// ���ο� ��ü�� �����ؾ� ���� �ٸ��� �Էµ� ������ ���� ��
		for (int i = 0; i < 2; i++) {
		    Person p1 = new Person();
		    System.out.print("Enter Person name : ");
		    Scanner input = new Scanner(System.in);
		    p1.setName(input.nextLine()); // �Է�����
		    System.out.print("Enter Person age [int] : ");
		    p1.setAge(input.nextInt()); // �Է�����
		    p1.print();
		    pArray1[i] = p1; // �̶� p�� ���ο� Person��ü
		}
		System.out.println("pArray2 : " + Arrays.toString(pArray1));
	}

}