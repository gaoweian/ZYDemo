import java.util.*;
public class Testcollection{
	public static void main(String[] args){
		List c = new ArrayList();
		//����Ԫ��
		c.add("�����");
		//��Ȼ���ϲ��ܷŻ����������ͣ���Java֧���Զ�װ��
		c.add(6);
		System.out.println("c�Ǽ��ϵ�Ԫ�ظ���Ϊ��"+c.size());
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c�Ǽ��ϵ�Ԫ�ظ���Ϊ��"+c.size());
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c�Ǽ����Ƿ����������ַ�����"+c.contains("�����"));
		c.add("������J2EE ��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		Collection books = new HashSet();
		books.add("������J2EE ��ҵӦ��ʵս");
		books.add("Struts2 Ȩ��ָ��");
		System.out.println("c�����Ƿ���ȫ����books����?��"+c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		//ɾ��c�����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		//books������ֻʣ��c������Ҳͬʱ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�"+books);
	}
}