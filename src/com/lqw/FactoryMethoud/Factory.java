package com.lqw.FactoryMethoud;

public class Factory {
	//����һ����������ķ���
	public static Human newHuman(Class c){
		
		//����һ����������
		Human human = null ;
		
		//����һ������
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return human;
	}
	
}
