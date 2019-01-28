package com.java.peng.design.pattern.behavioral.interpreter;

//解释器模式
//定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器就使用该表示来解释语言中的句子
//	为了解释一种语言，而为语言创建的解释器

//类型：行为型

//适用场景：某个特定类型问题发生频率足够高

//优点：语法由很多类表示，容易改变及扩展此“语言”

//缺点：当语法规则数目太多时，增加了系统的复杂度

//相关模式：
//适配器模式：

public class Test {
	 public static void main(String[] args) {
	        String pengInputStr="6 100 11 + *";
	        PengExpressionParser expressionParser=new PengExpressionParser();
	        int result=expressionParser.parse(pengInputStr);
	        System.out.println("解释器计算结果: "+result);
	  }
}
