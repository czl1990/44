package day02.javase.base;

import org.junit.Test;

public class TestScope {
	//�ֳ�3���:�������ַ���������������
	@Test//�������ַ��������Ķ��� 
	public void booleanAndChar(){
		Boolean b = false;//Ĭ��ֵ
		Boolean minBoolean = b.FALSE;
		System.out.println("������Сֵ��"+ minBoolean);
		
		Boolean maxBoolean = b.TRUE;
		System.out.println("�������ֵ��"+ maxBoolean);
		
		Character c = new Character('a');
		Character minChar = c.MIN_VALUE;
		System.out.println("�ַ���Сֵ:"+ minChar);
		
		Character maxChar = c.MAX_VALUE;
		System.out.println("�ַ����ֵ��"+ maxChar);
	}
	@Test//����
	public void testlnteger(){
		Byte b = 0;
		System.out.println("�ֽ���Сֵ��"+b.MIN_VALUE);
		System.out.println("�ֽ����ֵ��"+b.MAX_VALUE);
		
		Short s =0;
		System.out.println("��������Сֵ��"+s.MIN_VALUE);
		System.out.println("���������ֵ��"+s.MAX_VALUE);
		
		Integer i = 0;
		System.out.println("������Сֵ��" + i.MIN_VALUE);
		System.out.println("�������ֵ��" + i.MAX_VALUE);
		
		Long l = 0L;	//0L�ͱ�ʾ�����Σ���Ȼ�͵�������
		System.out.println("��������Сֵ��" + l.MIN_VALUE);
		System.out.println("���������ֵ��" + l.MAX_VALUE);
	}
	
	@Test	//������
	public void testDouble() {
		Float f = 0.0f;	//0.0��ʾ��С���㣬f��������
		System.out.println("��������Сֵ��" + f.MIN_VALUE);
		System.out.println("���������ֵ��" + f.MAX_VALUE);
		
		Double d = 0.0d;	//0.0d����˫���ȣ�Ĭ��ֵ
		System.out.println("˫������Сֵ��" + d.MIN_VALUE);
		System.out.println("˫�������ֵ��" + d.MAX_VALUE);

	}
	
}
