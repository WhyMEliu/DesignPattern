package com.java.peng.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {
	private IOrderDao iOrderDao;
	
	@Override
	public int saveOrder(Order order) {
		//没有Spring自动 注入，就先这样写了
		iOrderDao = new OrderDaoImpl();
		System.out.println("Service层调用Dao层添加Order");
		return iOrderDao.insert(order);
	}

}
