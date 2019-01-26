package com.java.peng.design.pattern.structural.proxy.dynamicproxy;

import com.java.peng.design.pattern.structural.proxy.IOrderService;
import com.java.peng.design.pattern.structural.proxy.Order;
import com.java.peng.design.pattern.structural.proxy.OrderServiceImpl;

//动态代理
public class Test {
	public static void main(String[] args) {
		Order order = new Order();
		order.setUserId(1);
		IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
		
		orderServiceDynamicProxy.saveOrder(order);
	}
}
