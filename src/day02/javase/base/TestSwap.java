package day02.javase.base;
/*
 * ��������ֵ
 */
public class TestSwap {
	public static void main(String[] args) {
		int a = 10;  //ԭʼ��ֵ
		int b = 20;  //ԭʼ��ֵ
//		System.out.println("ԭʼ��ֵa��"+a+","+"ԭʼ��ֵb��"+b);
//		
//		//������Ҫһ���µı�����Ϊת����
//		//ע�ⲻҪ��ʧ����
		int t = a;
		a = b;
		b = t;
		System.out.println("a������ֵ��"+a+",b������ֵ��"+b);
		
	}
}
