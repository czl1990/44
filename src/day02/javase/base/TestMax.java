package day02.javase.base;

import org.junit.Test;

public class TestMax {
	@Test
	public void max2(){
		int a=10;
		int b=20;
		
		int r=(a>b)?a:b;
		System.out.println("a��b�е����ֵ��"+r);
		
	}
	@Test  //��3��ֵ�����ֵ
	public void max3(){
		int a=10;
		int b=20;
		int c=30;
		
		int x=(a<b)?a:b;  //����Сֵ
		int t=(a>b)?a:b;  //�����ֵ
		System.out.println("a��b�е����ֵ��"+t);
		System.out.println("a��b�е���Сֵ��"+x);
		
		int y=(x<c)?x:c;
		int r=(t>c)?t:c;
		System.out.println("a,b,c�е����ֵ��"+r);
		System.out.println("a,b,c�е���Сֵ��"+y);
		
		
	}
	@Test
	public void max4(){
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		int t=(a>b)?a:b;
		System.out.println("a��b�е����ֵ��"+t);
		
		int f=(t>c)?t:c;
		System.out.println("a,b,c�е����ֵ��"+f);
		
		int g=(f>d)?f:d;
		System.out.println("a,b,c,d�е����ֵ��"+g);
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
	
	//�����ֵ�����������з���ֵ
	public int max(int a,int b){
		int t=(a>b)?a:b;
		return t;
		}
	public int min(int a,int b){
		int x=(a<b)?a:b;
		return x;
	}
}
