package day02.javase.base;

import org.junit.Test;

public class TestScope {
	//分成3情况:布尔、字符、整数、浮点数
	@Test//布尔和字符，方法的定义 
	public void booleanAndChar(){
		Boolean b = false;//默认值
		Boolean minBoolean = b.FALSE;
		System.out.println("布尔最小值："+ minBoolean);
		
		Boolean maxBoolean = b.TRUE;
		System.out.println("布尔最大值："+ maxBoolean);
		
		Character c = new Character('a');
		Character minChar = c.MIN_VALUE;
		System.out.println("字符最小值:"+ minChar);
		
		Character maxChar = c.MAX_VALUE;
		System.out.println("字符最大值："+ maxChar);
	}
	@Test//整型
	public void testlnteger(){
		Byte b = 0;
		System.out.println("字节最小值："+b.MIN_VALUE);
		System.out.println("字节最大值："+b.MAX_VALUE);
		
		Short s =0;
		System.out.println("短整形最小值："+s.MIN_VALUE);
		System.out.println("短整形最大值："+s.MAX_VALUE);
		
		Integer i = 0;
		System.out.println("整形最小值：" + i.MIN_VALUE);
		System.out.println("整形最大值：" + i.MAX_VALUE);
		
		Long l = 0L;	//0L就表示长整形，不然就当做整形
		System.out.println("长整形最小值：" + l.MIN_VALUE);
		System.out.println("长整形最大值：" + l.MAX_VALUE);
	}
	
	@Test	//浮点数
	public void testDouble() {
		Float f = 0.0f;	//0.0表示有小数点，f代表单精度
		System.out.println("单精度最小值：" + f.MIN_VALUE);
		System.out.println("单精度最大值：" + f.MAX_VALUE);
		
		Double d = 0.0d;	//0.0d代表双精度，默认值
		System.out.println("双精度最小值：" + d.MIN_VALUE);
		System.out.println("双精度最大值：" + d.MAX_VALUE);

	}
	
}
