package com.efg;
import java.util.Scanner;
public class Demo {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int money;
	public static void main(String[] args) {
		welcome();
	}
	public static void welcome(){
		System.out.println("------��ȡ��-------");
		System.out.println("------1.�˻���Ϣ------");
		System.out.println("------2.���------");
		System.out.println("------3.ȡ��------");
		System.out.println("------4.�˳�------");
		int p = sc.nextInt();
		switch(p){
			case 1:
				System.out.println("�����û�����");
				name = sc.next();
				System.out.println("������");
				money = sc.nextInt();
				System.out.println("1.����Ŀ¼----2.�˳�");
				int i = sc.nextInt();
				if(i==1){
					welcome();
				}else if(i==2){
					System.exit(0);
				}
				break;
			case 2:
				System.out.println("�������");
				money = sc.nextInt();
				System.out.println("1.����Ŀ¼----2.�˳�");
				int b = sc.nextInt();
				if(b==1){
					welcome();
				}else if(b==2){
					System.exit(0);
				}
				break;
			case 3:	
				ZhangHu zhanghu = new ZhangHu(name,money);
				System.out.println("����ȡ���");
				int s = sc.nextInt();
				QuqianThread ka = new QuqianThread(zhanghu,s);
				new Thread(ka).start();
				System.out.println("1.����Ŀ¼----2.�˳�");
				int n = sc.nextInt();
				if(n==1){
					welcome();
				}else if(n==2){
					System.exit(0);
				}
			case 4:	
				System.exit(0);
		}
	}
	
}