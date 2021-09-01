
public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ops = {'+', '-', '*', '/'};
		int[][] numbers = {{60,50}, {40,30}, {20,10}};
		for (char op : ops) {
		    for (int i = 0; i < numbers.length; i++) {
		        int result = calc(numbers[i][0], numbers[i][1], op);  //각 열의 두 수를 사칙연산
		        System.out.printf("result = %d %s %d = %d\n", numbers[i][0], op, numbers[i][1], result);
		    }
		}
	}

	private static int calc(int i, int j, char op) {
		 switch(op) {
         case '+': return i + j;
         case '-': return i - j;
         case '*': return i * j;
         case '/': return i / j;
         default:
             System.out.println("op not found");
             return 0;
		 }
	}
}
