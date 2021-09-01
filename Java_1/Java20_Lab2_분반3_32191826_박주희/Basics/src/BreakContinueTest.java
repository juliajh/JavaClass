import java.util.*;

public class BreakContinueTest
{
    public static void main(String[] args)
	{
        String outputString1 = "";
        String outputString2 = "";
        String outputString3 = "";
        int[] intArray = { 2, 1, 4, 5, 10, 3, 9, 7, 6, 8 };  //intArray�迭 ���� �� �ʱ�ȭ

        //for-each
        for (int i : intArray) //intArray.length�� �ݺ�.i�� intArray[0],...,intArray[20]�� ������ �ݺ�
        {
            outputString1 += i + " ";        // string addition
        }
        System.out.println(outputString1);    // 2 1 4 5 10 3 9 7 6 8

        for (int i : intArray)
        {
            if (i == 5)  //i���� 5���� ���� �������� ���
                break;
            outputString2 += i + " ";    
        }
        System.out.println(outputString2);    // 2 1 4

        for (int i : intArray)
        {
            if (i%3 == 0)  //3�� ����� ���� ���
                continue;
            outputString3 += i + " ";    
        }
        System.out.println(outputString3);    // 2 1 4 5 10 7 8
    }
}
