public class ArithmeticOperator{
	public static void main(String[] agrs){
		
        // ȡģ��ʽ  a % b = a - a / b * b
		System.out.println(-10 % 3);    // -1
		System.out.println(10 % -3);    //  1
		System.out.println(-10 % -3);   // -1


		System.out.println("-----------------");
		int i = 1;
		i = i++;      // ������һ���м����  temp = i�� i = i + 1��i = temp
		System.out.println(i);
	} 
} 