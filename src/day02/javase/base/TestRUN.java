package day02.javase.base;

import java.util.Scanner;

public class TestRUN {
	public static void main(String[] args) {
		//取余，如果一个数字是偶数还是奇数
		//利用取余，对2取余数，如果余数是0为偶数，如果余数是1为奇数
//		System.out.println("请输入");
//		int i=new Scanner(System.in).nextInt();   //这两行代码为输入代码 
		short i=10;
		short r=(short)(i%2);
	
		if (r==0) {
			System.out.println("偶数"+r);	
		}else {
			System.out.println("奇数"+r);
		}
	}
	
	}

