import java.util.*;
public class ListDemo{
	public static void main(String[] args){
		//创建对象
		List<String> l = new ArrayList<String>();
		//List<String> l = new LinkedList<String>();
		//添加元素
		l.add("A");
		l.add("C");
		l.add("D");
		l.add("B");
		//返回l中的元素个数
		//System.out.println("l中的元素个数:"+l.size());
		//
		System.out.println("获取与0号索引关联的项是:"+l.get(0));
		//删除指定元素
		//l.remove("A");
		//清空所有元素
		//l.clear();
		//直接输出所有元素
		//System.out.println(l);
		//for-each遍历
		//for(String i:l){
		//	System.out.println(i);
		//}
		//迭代器
		Iterator  a  =  l.iterator();
		while(a.hasNext()){
			System.out.println(a.next() );
		}
	}
}