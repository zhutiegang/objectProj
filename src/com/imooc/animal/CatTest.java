package com.imooc.animal;

public class CatTest {
	public static void main(String[] args){
		//����ʵ����
		Cat one=new Cat("����",2,1000,"Ӣ����ëè");
		System.out.println("�ǳƣ�"+one.name);
		System.out.println("���䣺"+one.month);
		System.out.println("���أ�"+one.weight);
		System.out.println("Ʒ�֣�"+one.species);
		one.run();
	}
}
