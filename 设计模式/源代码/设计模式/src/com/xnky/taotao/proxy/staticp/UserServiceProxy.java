package com.xnky.taotao.proxy.staticp;

public class UserServiceProxy  implements UserService {
	private UserService userService;

	public UserServiceProxy(UserService userService) {
		super();
		this.userService = userService;
	}
	@Override
	public void add(Object object) {
		open();
		userService.add(object);
		clos();
	}

	@Override
	public void update(Object object) {
		open();
		userService.update(object);
		clos();
	}

	@Override
	public void delete(String id) {
		open();
		userService.delete(id);	
		clos();
	}

	@Override
	public void select(String id) {
		userService.select(id);
	}
	private void open() {
		System.out.println("========================");
		System.out.println("开启事物");
	}
	private void clos() {
		System.out.println("关闭事物");
		System.out.println("========================");
	}
}
