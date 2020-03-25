package day02.javase.base;
/*
 * 交换两个值
 */
public class TestSwap {
	public static void main(String[] args) {
		int a = 10;  //原始数值
		int b = 20;  //原始数值
//		System.out.println("原始数值a："+a+","+"原始数值b："+b);
//		
//		//交换需要一个新的变量作为转换器
//		//注意不要丢失数据
		int t = a;
		a = b;
		b = t;
		System.out.println("a交换的值："+a+",b交换的值："+b);
		
	}
}
