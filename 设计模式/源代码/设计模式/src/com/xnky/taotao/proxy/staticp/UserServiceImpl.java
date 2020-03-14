package com.xnky.taotao.proxy.staticp;

public class UserServiceImpl  implements UserService{
	private  UserDao userDao=new UserDaoImpl();
	@Override
	public void add(Object object) {
		userDao.add(object);
	}

	@Override
	public void update(Object object) {
		userDao.update(object);		

	}

	@Override
	public void delete(String id) {
		userDao.delete(id);
	}

	@Override
	public void select(String id) {
		userDao.select(id);
	}

}
