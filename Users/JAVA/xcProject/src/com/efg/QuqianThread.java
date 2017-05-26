package com.efg;

public class QuqianThread implements Runnable{
	private ZhangHu zhanghu;
	private int money;
	public QuqianThread(ZhangHu zhanghu,int money){
		this.zhanghu = zhanghu;
		this.money = money;
	}
	
	public void run(){
		//同步代码块
		synchronized(zhanghu){
			if(zhanghu.getNumber()>=money){
				//账户余额够
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("取款成功，取走了"+money+"元，余额是"+zhanghu.getNumber()+"元");
			}else{
				System.out.println("余额不足，当前余额还剩："+zhanghu.getNumber()+"元，差"+(money-zhanghu.getNumber())+"元");
			}
		}
	}
}
