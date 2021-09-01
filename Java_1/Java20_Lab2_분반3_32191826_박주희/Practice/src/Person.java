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
		// 만약 Person 객체를 하나만 생성한 후 for문에서 공유해 사용할 경우
		// 마지막으로 입력된 데이터로 모든 데이터값이 치환됨
		Person p = new Person();
		for (int i = 0; i < 2; i++) {
		    System.out.print("Enter Person name : ");
		    Scanner input = new Scanner(System.in);
		    p.setName(input.nextLine()); // 입력정보
		    System.out.print("Enter Person age [int] : ");
		    p.setAge(input.nextInt()); // 입력정보
		    p.print();
		    pArray[i] = p; // 리스트에 들어간 모든 원소는 동일한 p
		}
		System.out.println("pArray : " + Arrays.toString(pArray));

		Person[] pArray1 = new Person[2];
		// 아래와 같이 for문 안에 Person p = new Person()와같이
		// 새로운 객체를 생성해야 각자 다르게 입력된 정보가 들어가게 됨
		for (int i = 0; i < 2; i++) {
		    Person p1 = new Person();
		    System.out.print("Enter Person name : ");
		    Scanner input = new Scanner(System.in);
		    p1.setName(input.nextLine()); // 입력정보
		    System.out.print("Enter Person age [int] : ");
		    p1.setAge(input.nextInt()); // 입력정보
		    p1.print();
		    pArray1[i] = p1; // 이때 p는 새로운 Person객체
		}
		System.out.println("pArray2 : " + Arrays.toString(pArray1));
	}

}