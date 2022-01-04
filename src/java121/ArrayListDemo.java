package java121;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	       List<Cat> cats=new ArrayList<Cat>();
	
	       Cat tomcat=new Cat();
	       tomcat.setName("Tom");
	
	       Cat jackcat=new Cat();
	       jackcat.setName("Jack");
	
	       Cat johncat=new Cat();
	       johncat.setName("John");
	
	       Cat anncat=new Cat();
	       anncat.setName("Ann");
	
	       // 添加和删除元素
	       cats.add(tomcat);    // tom(0)
	       cats.add(jackcat);   // jack(1)-tom(0)
	       cats.add(johncat);   // john(2)-jack(1)-tom(0)
	       cats.add(2,anncat);  // 将下面的元素添加到第2个位置
	                            // john(3)- anncat(2)-jack(1)-tom(0)
	       cats.remove(jackcat);         // 删除元素// john(2)- anncat(1)-tom(0)
	
	       // 设置和获取元素
	       cats.set(0,jackcat); // john(2)- anncat(1)-jack(0)
	
	       System.out.println(cats.get(0).getName());
	
	       // 判断元素和元素位置
	       System.out.println(cats.contains(jackcat));
	       System.out.println(cats.indexOf(jackcat));
	       
	       //----------------------------------------------
//	       // 清除元素
//	       cats.clear();
//
//	       // 判断链表是否为空
//	       System.out.println(cats.isEmpty());

	       // 将ArrayList转换为数组
	       Cat[] c = cats.toArray(new Cat[0]);
	       System.out.println(c[0].getName());

	       // 将ArrayList转换为数组2
		   Cat[] array =new Cat[cats.size()];
		   cats.toArray(array);

		   for (int i=0;i<array.length;i++) {
			  System.out.println(array[i].getName());
		   }
	       
	       //----------------------------------------------
		// 通过索引值访问，可顺序遍历，也可随机访问。
	       for (int i=0;i<cats.size();i++) {
		     System.out.println(cats.get(i).getName());
	       }

	       // 通过迭代器访问，实现顺序遍历。
	       Iterator it = cats.iterator();
	       while(it.hasNext()) {
	          Cat cat = (Cat)it.next();
	          System.out.println(cat.getName());
	       }

	       // 通过ForEach循环访问，实现顺序遍历。
	       for (Cat cat:cats){
		      System.out.println(cat.getName());
	       }


		
	}
}
