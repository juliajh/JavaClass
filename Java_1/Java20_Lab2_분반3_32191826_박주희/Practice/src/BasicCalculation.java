import java.util.Scanner;

// for, foreach, if/else-if, switch, array, 2D array
public class BasicCalculation {

    public static Scanner scan = new Scanner(System.in);

    // calc (using if/else-if)
    public static int calc(int x, int y, char op) {
        if (op == '+') return x + y;
        else if (op == '-') return x - y;
        else if (op == '*') return x * y;
        else if (op == '/') return x / y;
        else {
            System.out.println("op not found");
            return 0;
        }
    }

    // calc2 (using switch)
    public static int calc2(int x, int y, char op) {
        switch(op) {
            case '+': return x + y;
            case '-': return x - y;
            case '*': return x * y;
            case '/': return x / y;
            default:
                System.out.println("op not found");
                return 0;
        }
    }

    // get user input op[+,-,*,/]
    static public char getUserInputOp() {
        char value = '\0';
        do {
            System.out.printf("Please enter the operator [+,-,*,/]: ");
            try {
                value = scan.next().charAt(0);
                System.out.println("value=" + value);
            }
            catch (Exception e) {  //사칙 연산 이외의 값을 입력 했을 때
                System.out.printf("Error! Please re-enter!\n");
                scan.next();
                continue;
            }
        } while (value != '+' && value != '-' && value != '*' && value != '/');
        return value;
    }

    public static void main(String[] args) {
        // for
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }
        // while
        int j = 0;
        while (j < 5) {
            System.out.println("j=" + j);
            j++;
        }
        // do-while
        int k = 0;
        do {
            System.out.println("k=" + k);
            k++;
        } while (k < 5);
        // break (0~4)
        int x = 0;
        while (true) {
            if (x >= 5) break;
            System.out.println("x=" + x);
            x++;
        }
        // continue (0~4)
        int y = 0;
        while (y < 5) {
            y++; // (1~5)
            if (y % 2 == 1) // 홀수
                continue;
            System.out.println("y=" + y); // 짝수만 출력
        }
        // for-each
        System.out.print("Please enter two numbers: ");
        x = scan.nextInt(); 
        y = scan.nextInt();
        char[] ops = {'+', '-', '*', '/', '^'}; // char array
        for (char op : ops) {  //입력된 두 숫자의 사칙연산 값을 모두 출력
            int z = calc(x, y, op);
            System.out.printf("z = %d %s %d = %d\n", x, op, y, z);
        }
        // 2D array
        int[][] numbers = {{49, 57}, {36, 29}, {88, 66}};
        for (char op: ops) {
            for (int i = 0; i < numbers.length; i++) {
               int r = calc2(numbers[i][0], numbers[i][1], op);
               System.out.printf("r = %d %c %d = %d\n", 
                       numbers[i][0], op, numbers[i][1], r);
            }
        }
        // user input
        System.out.print("Please enter two numbers: ");
        x = scan.nextInt();
        y = scan.nextInt();
        char op = getUserInputOp();
        int w = calc2(x, y, op);
        System.out.printf("w = %d %s %d = %d\n", x, op, y, w);
    }
}
