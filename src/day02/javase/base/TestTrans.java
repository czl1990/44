package day02.javase.base;
/*
 * ��������֮���ת��
 */
public class TestTrans {
	public static void main(String[] args) {
		byte b=100;
		short s=b;    //��b���Ƹ�short   С����ת�������ͣ�  �Զ�ת��
		System.out.println(s);
		
		byte g=(byte)s; //Ĭ��int����   ��תСǿ��ת��
		System.out.println(g);
		
		int a=600;
		byte f=(byte)a;  //ת����ֵ�п������
		System.out.println(f);
	}
}
