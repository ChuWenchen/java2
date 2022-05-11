public class StringTest{
	public static void main(String[] agrs){
		int a = 100;
		float b = 3.14f;
		double c=2.1;
		boolean d = true;
		// 基本数据类型转String
		String s1 = a + "";
		String s2 = b + "";
		String s3 = c + "";
		String s4 = d + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " ");
        
        //String转基本数据类型
        //通过基本类型的包装类调用parseXX方法
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        short num6 = Short.parseShort(s5);
        boolean e = Boolean.parseBoolean("true");
        System.out.println("--------------------");
        System.out.println(num1); // 123
        System.out.println(num2); // 123.0
        System.out.println(num3); // 123.0
        System.out.println(num4); // 123
        System.out.println(num5); // 123
        System.out.println(num6); // 123
        System.out.println(e);    //true

	}
}