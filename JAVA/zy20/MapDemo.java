import java.util.*;
public class MapDemo{
	 public static void main(String[] args){
		 //��������
		Map<String,String>  hm = new  HashMap<String,String>();
		//Map<String,String>  hm = new  LinkedHashMap<String,String>();
		//����Ԫ��
		hm.put("1","a");
		hm.put("2","b");
		hm.put("6","Eric");
		hm.put("3","d");
		hm.put("7","Eric");
		//����hm�е�Ԫ�ظ���
		//System.out.println("hm�е�Ԫ�ظ���:"+hm.size());
		//hm.remove("1");//ɾ��ָ������
		//hm.clear();//�������Ԫ��
		//hm.get("7");//���ݼ�����ֵ
		//System.out.println(hm.entrySet());//����
		//System.out.println(hm);//��ѯ���
		
		Set keys = hm.keySet();//�õ����е�key����������һ��Set��
		//����
		Iterator  i  =  keys.iterator();
		while(i.hasNext()){
			String key = (String)i.next(); 
			String value = (String)hm.get(key);
			System.out.println(key+"------"+value);//�Զ�����
		}
	 }
}



