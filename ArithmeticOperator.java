public class ArithmeticOperator{
	public static void main(String[] agrs){
		
        // 取模公式  a % b = a - a / b * b
		System.out.println(-10 % 3);    // -1
		System.out.println(10 % -3);    //  1
		System.out.println(-10 % -3);   // -1


		System.out.println("-----------------");
		int i = 1;
		i = i++;      // 创建了一个中间变量  temp = i； i = i + 1；i = temp
		System.out.println(i);
	} 
} 