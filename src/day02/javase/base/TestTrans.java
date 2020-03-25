package day02.javase.base;
/*
 * 数字类型之间的转换
 */
public class TestTrans {
	public static void main(String[] args) {
		byte b=100;
		short s=b;    //把b复制给short   小类型转换大类型，  自动转换
		System.out.println(s);
		
		byte g=(byte)s; //默认int类型   大转小强制转换
		System.out.println(g);
		
		int a=600;
		byte f=(byte)a;  //转换的值有可能溢出
		System.out.println(f);
	}
}
