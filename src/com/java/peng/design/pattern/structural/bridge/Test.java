package com.java.peng.design.pattern.structural.bridge;

//桥接模式
//定义：将抽象部分与它的具体实现部分分离，使它们都可以独立的变化
//	通过组合的方式建立两个类之间联系，而不是继承

//类型：结构型

//适用场景：抽象和具体实现之间增加更多的灵活性
//	一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展
//	不希望适用继承，或因为多层继承导致系统类的个数剧增

//优点：分离抽象部分及具体实现部分
//	提高了系统的可扩展性
//	符合开闭原则
//	符合合成复用原则

//缺点：增加了系统的理解与设计难度
//	需要正确地识别出系统中两个独立变化的维度

//相关设计模式：
//桥接模式和组合模式
//桥接模式和适配器模式
public class Test {
	public static void main(String[] args) {
		Bank icbcBank = new ICBCBank(new DepositAccount());
		Account icbcAccount = icbcBank.openAccount();
		icbcAccount.showAccountType();
		
		Bank icbcBank2 = new ICBCBank(new SavingAccount());
		Account icbcAccount2 = icbcBank2.openAccount();
		icbcAccount2.showAccountType();
		
		Bank abcBank = new ABCBank(new SavingAccount());
		Account abcAccount = abcBank.openAccount();
		abcAccount.showAccountType();
	}
}
