//ö����
/**
���壺ö�پ���Ҫ�ø������͵ı�����ȡֵֻ��Ϊ���ɸ��̶�ֵ��һ����
����������ͻᱨ��
ö�ٿ����ñ������ڱ���ʱ�Ϳ��Կ��Ƴ��򸳸��ķǷ�ֵ��
ʹ����ͨ�����ķ�ʽ�޷�ʵ����һĿ��
��Դ����jdk1.5֮��ʹ�ùؼ���enum�����һ�������ͣ���Ϊö����

*/
public class Demo{
	public static void main(String[] args){
		EnumDome ed = EnumDome.ON;
		System.out.println(ed);//�õ���ֵ
		System.out.println(ed.name());//����ö��ʵ������
		System.out.println(ed.ordinal());//���ص�ǰʵ������
		EnumDome [] arrayED = ed.values();//���鷵��ֵ�ֶθ�����������
		System.out.println(ed.toString());//����ö�ٶ���ġ�����������;
		for(int i=0; i<arrayED.length;i++){
			System.out.println(arrayED[i]);
		}
	}
}
enum EnumDome{
	ON,OFF; 
}
/**
ʹ��enum�ؼ��ֶ����ö���࣬���൱�ڶ�����һ���࣬����̳���Enum�����
Enum�ඨ����һ�·���  
String name();// ����ö��ʵ������;
	int ordinal();// ����ö��ʵ����ö�����е�����,��0��ʼ;
	String toString();// ����ö�ٶ����"��������";(��Դ����)

*/