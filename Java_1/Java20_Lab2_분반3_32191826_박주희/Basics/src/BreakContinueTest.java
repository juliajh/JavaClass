import java.util.*;

public class BreakContinueTest
{
    public static void main(String[] args)
	{
        String outputString1 = "";
        String outputString2 = "";
        String outputString3 = "";
        int[] intArray = { 2, 1, 4, 5, 10, 3, 9, 7, 6, 8 };  //intArray배열 생성 및 초기화

        //for-each
        for (int i : intArray) //intArray.length번 반복.i는 intArray[0],...,intArray[20]로 번갈아 반복
        {
            outputString1 += i + " ";        // string addition
        }
        System.out.println(outputString1);    // 2 1 4 5 10 3 9 7 6 8

        for (int i : intArray)
        {
            if (i == 5)  //i값이 5보다 작을 경우까지만 출력
                break;
            outputString2 += i + " ";    
        }
        System.out.println(outputString2);    // 2 1 4

        for (int i : intArray)
        {
            if (i%3 == 0)  //3의 배수를 빼고 출력
                continue;
            outputString3 += i + " ";    
        }
        System.out.println(outputString3);    // 2 1 4 5 10 7 8
    }
}
