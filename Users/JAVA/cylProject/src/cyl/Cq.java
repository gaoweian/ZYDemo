package cyl;
import java.util.Scanner;
public class Cq {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("��ȭ-----1.ʯͷ��2.������3.��");
		System.out.print("������\n�ҷ�=");
		//while(true){
		int a=sc.nextInt();
		int b=(int)((Math.random()*3)+1);
		if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)){
			System.out.println("�Է�="+b+"\n�ҷ���");
		}else if((a==1&&b==1)||(a==2&&b==2)||(a==3&&b==3)){
			System.out.println("�Է�="+b+"\n˫��ƽ");
		}else{
			System.out.println("�Է�="+b+"\n�ҷ�Ӯ");
		}
		//}
	}	
}