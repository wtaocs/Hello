package com.lqw.FactoryMethoud;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("����������");
		WhiteHuman whiteHuman = (WhiteHuman) Factory.newHuman(WhiteHuman.class);
		whiteHuman.speak();
		whiteHuman.eat();
		
		System.out.println("�����ֺ���");
		BlackHuman blackHuman = (BlackHuman) Factory.newHuman(BlackHuman.class);
		blackHuman.speak();
		blackHuman.eat();
		
		System.out.println("����������");
		YellowHuman yellowHuman = (YellowHuman) Factory.newHuman(YellowHuman.class);
		yellowHuman.speak();
		yellowHuman.eat();
		
		
	}

}
