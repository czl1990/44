package day02.javase.base;

import org.junit.Test;

public class TestMax {
	@Test
	public void max2(){
		int a=10;
		int b=20;
		
		int r=(a>b)?a:b;
		System.out.println("a和b中的最大值："+r);
		
	}
	@Test  //求3个值的最大值
	public void max3(){
		int a=10;
		int b=20;
		int c=30;
		
		int x=(a<b)?a:b;  //求最小值
		int t=(a>b)?a:b;  //求最大值
		System.out.println("a和b中的最大值："+t);
		System.out.println("a和b中的最小值："+x);
		
		int y=(x<c)?x:c;
		int r=(t>c)?t:c;
		System.out.println("a,b,c中的最大值："+r);
		System.out.println("a,b,c中的最小值："+y);
		
		
	}
	@Test
	public void max4(){
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		int t=(a>b)?a:b;
		System.out.println("a和b中的最大值："+t);
		
		int f=(t>c)?t:c;
		System.out.println("a,b,c中的最大值："+f);
		
		int g=(f>d)?f:d;
		System.out.println("a,b,c,d中的最大值："+g);
	}
	@Test
	public void max22(){
		int a=30;
		int b=20;
		
		int r=max(a, b);
		int x=min(a, b);
		System.out.println(r);
		System.out.println(x);
	}
	
	//求最大值方法，必须有返回值
	public int max(int a,int b){
		int t=(a>b)?a:b;
		return t;
		}
	public int min(int a,int b){
		int x=(a<b)?a:b;
		return x;
	}
}
