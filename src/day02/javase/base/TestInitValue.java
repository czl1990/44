package day02.javase.base;


public class TestInitValue {
	public static void main(String[] args) {
		
		boolean b = false;
		System.out.println("布尔类型："+b);
		
		char c=0;
		System.out.println("字符类型："+c);
		
		byte bt=0;
		System.out.println("字节类型："+bt);
		
		short s=0;
		System.out.println("短整形："+s);
		
		int i=0;
		System.out.println("整形："+i);
		
		long l=0;
		System.out.println("长整形："+l);
		
		float f=0.0f;
		System.out.println("单精度浮点类型："+f);
		
		double d=0.0d;
		System.out.println("双精度浮点类型："+d);
		
		Integer r1 =null;
		Integer r2 = new Integer(11);
		
		System.out.println("包装类型："+r1);
		System.out.println(r2);
		
		double i1=0.0d;
		Integer i2=new Integer(0);
		System.out.println(i1+","+i2);
		
	}
	
	
	}