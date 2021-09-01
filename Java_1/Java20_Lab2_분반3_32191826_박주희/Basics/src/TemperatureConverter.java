import java.util.Scanner;

public class TemperatureConverter {
	enum Converter {
		FAHRENHEIT_TO_CELSIUS(1),
		CELSIUS_TO_FAHRENHEIT(2);
		
		private final int type;  //���� type ����
		Converter(int type) {
			this.type = type;
		}
		
		public int getType() {  //type�� ��ȯ�ϴ� getType �޼ҵ�
			return type;
		}

		public static Converter valueOf(int value) {
			switch (value) { // switch
			case 1:
				return FAHRENHEIT_TO_CELSIUS;
			case 2:
				return CELSIUS_TO_FAHRENHEIT;
			}
			return null;
		}
	}
	
	static float fromFahrenheitToCelsius(float F)  //F�� �Է� �޴� fromFahrenheitToCelsius �޼ҵ� ����
    {
        return (F - 32.0f) * (5.0f / 9.0f);  //Fahrenheit�� Celsius�� ��ȯ�Ͽ� return
    }

    static float fromCelsiusToFahrenheit(float C)  //C�� �Է� �޴� fromCelsiusToFahrenheit �޼ҵ� ����
    {
        return ((9.0f / 5.0f) * C + 32.0f);  //Celsius�� Fahrenheit�� ��ȯ�Ͽ� return
    }
    
	public static float getUserInputFloat() {  
		float value;  //���� value ����
		Scanner input = new Scanner(System.in);  //scanner ��ü ����
    	while(true) {  //��� �ݺ�
    		try {
    			value = input.nextFloat(); //���� ��ū�� floatŸ������ ����
    			break; 
    		}
    		catch (Exception e) { //Exception e ���ܰ� �� ��
    			System.out.print("Error! Please re-enter [float value]: ");
    			input.next(); //���� ��ū ����
    		}
    	}
        return value;
	}

	public static void calculate(Converter mode) {
		if (mode == Converter.FAHRENHEIT_TO_CELSIUS) { // if-else
			System.out.print("Please enter temperature (Celsius): " );
			float tempC = getUserInputFloat();

	        float tempFFloat = fromCelsiusToFahrenheit(tempC);
	        System.out.printf("C = %f => F = %f\n", tempC, tempFFloat);
		}
		else if (mode == Converter.CELSIUS_TO_FAHRENHEIT) {
			System.out.print("Please enter temperature (Fahrenheit): " );
			float tempF = getUserInputFloat();

			float tempCFloat = fromFahrenheitToCelsius(tempF);
	        System.out.printf("F = %f => C = %f\n", tempF, tempCFloat);			
		}
	}
	
	public static int getUserInput() {
		int value = 0;
		System.out.println("Please select temperature converter");	
		Scanner input = new Scanner(System.in);
    	do { // do-while
    		System.out.print("Enter 1.Fahrenheit->Celsius or 2.Celsius->Fahrenheit: " );
    		try {
    			value = input.nextInt();
    		}
    		catch (Exception e) {
    			System.out.println("Error! Please re-enter integer value");
    			input.next();
    			continue;
    		}
    	} while(value < 1 || value > 2);
    	return value;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i<3; i++) { // for
			calculate(Converter.valueOf(i));
		}
		
		for(Converter c : Converter.values()) { // foreach
			calculate(c);
		}

		int mode = getUserInput(); // get user input
		calculate(Converter.valueOf(mode));
	}
}