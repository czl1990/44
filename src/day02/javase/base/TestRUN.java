package day02.javase.base;

import java.util.Scanner;

public class TestRUN {
	public static void main(String[] args) {
		//ȡ�࣬���һ��������ż����������
		//����ȡ�࣬��2ȡ���������������0Ϊż�������������1Ϊ����
//		System.out.println("������");
//		int i=new Scanner(System.in).nextInt();   //�����д���Ϊ������� 
		short i=10;
		short r=(short)(i%2);
	
		if (r==0) {
			System.out.println("ż��"+r);	
		}else {
			System.out.println("����"+r);
		}
	}
	
	}

