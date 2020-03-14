package com.xnky.taotao.proxy.staticp;

public class UserDaoImpl implements UserDao{

	@Override
	public void add(Object object) {
		System.out.println("添加对象------------");
	}

	@Override
	public void update(Object object) {
		System.out.println("修改对象----------------");
		
	}

	@Override
	public void delete(String id) {
		System.out.println("删除对象------------");
		
	}

	@Override
	public void select(String id) {
		System.out.println("查询对象-----------------");
		
	}

}
