import java.util.Scanner;

public class DataTypeTest {

	public static void main(String[] args) {
		// 1. boolean test
		boolean a = true;
		System.out.println("a : " + a);
		a = ( 10 > 12 );
		System.out.println("a : " + a);

		// 2. char test
        char korVal = '가';
		System.out.println(korVal);

		// 3. String test
		String str1 = "안녕하세요";
		String str2 = "Hello World!";
		System.out.println(str1 == str2);					
		
        String c = "Good Morning \u0066";			// \udddd (dddd is 4-digit number)는 유니코드를 표현
        System.out.println(c);						

        String d = c;										// f = d
        System.out.println(d.charAt(0));                    // f[0] = 'G';
        d += "ellow";										// f = Good Morning fellow 값을 변경
        System.out.println(d);								// Good Morning fellow
        System.out.println(c);								// Good Morning f
        
        // 4. byte, short, int, long, float, double
		byte byteVal = 10;
		System.out.println("byteVal=" + byteVal); 
		byteVal = (byte) (byteVal + 20);
		System.out.println("byteVal=" + byteVal); 

		short shortVal = 10;
		System.out.println("shortVal=" + shortVal); 
		shortVal = (short) (shortVal + 20);
		System.out.println("shortVal=" + shortVal); 

		int intVal = 10;
		System.out.println("intVal=" + intVal); 
		intVal = intVal + 15;
		System.out.println("intVal=" + intVal); 

		long longVal = 1234567890123456789l;
		System.out.println("longVal=" + longVal); 

		float floatVal;
		floatVal = 1.234f;
		System.out.println("floatVal=" + floatVal); 

		double doubleVal = 3.141592;
		System.out.println("doubleVal=" + doubleVal); 
		
		// 5. implicit/explicit type conversion
		int iVal = 32555;
		byte bVal = 25;
		long lVal = iVal; // implicit type conversion
		System.out.println(lVal); 
		iVal = (int) lVal; // explicit type conversion
		System.out.println(iVal); 
		lVal = bVal; // implicit type conversion
		System.out.println(lVal);
		bVal = (byte) lVal; // explicit type conversion
		System.out.println(bVal);
		
		bVal = 127; 
		iVal = 100; 
		System.out.println("bVal+iVal=" + (bVal+iVal)); // 127 + 100 = 227
		System.out.println("(10/4)=" + (10/4)); // int divided by int 2.5 => 2
		System.out.println("(10.0/4)=" + (10.0/4)); // double divide by int => double divided by double => 2.5
		System.out.println((char)0x12340041); 
		System.out.println((byte)(bVal+iVal)); // 127 + 100 => (byte)227 => 1110 0011 => 1 + 2 + 32 + 64 - 128 => -29
		System.out.println((int)2.9 + 1.8); // 2 + 1.8 => 2.0 + 1.8 => 3.8
		System.out.println((int)(2.9 + 1.8)); // (int)4.1 => 4
		System.out.println((int)2.9 + (int)1.8); // 2 + 1 => 3

		// 6. int <-> String type conversion
		// integer => string type conversion
		int i = -10;                    // -10
		String s1 = Integer.toString(i); // “-10”
		String s2 = String.valueOf(i); // “-10”
		String s4 = String.format("%d", i); // “-10”
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s4 = " + s4);

		//http://javadevnotes.com/java-string-to-integer-examples
		// string => integer type conversion
		String x = "-123";          // “-123”
		int y = Integer.parseInt(x); // -123 (integer로 변환이 가능한 경우만 변환 가능 그 외엔 run-time exception error)
		int z = Integer.valueOf(x); // -123 (integer로 변환이 가능한 경우만 변환 가능 그 외엔 run-time exception error)
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		// 7. using Scanner class
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter two integer numbers: ");
		int val1 = input.nextInt();
		int val2 = input.nextInt();
		System.out.println("The sum of two numbers is " + (val1 + val2));
	}
}
