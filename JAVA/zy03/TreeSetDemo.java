import java.util.*;

public class TreeSetDemo {
  public static void main(String args[]) {
    //����һ������
	Set set = new TreeSet();
	//����������������
    set.add("Bernadine");
    set.add("Elizabeth");
    set.add("Gene");
    set.add("Elizabeth");
    set.add("Clara");
    //set.add(123);
    //set.add(0.23);
    System.out.println(set);
   
  }
}