package java121;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// 新建HashSet
		Set<Cat> cats = new HashSet<Cat>();
		
		Cat tomcat=new Cat();
        tomcat.setName("Tom");

        Cat jackcat=new Cat();
        jackcat.setName("Jack");

        Cat johncat=new Cat();
        johncat.setName("John");

		cats.add(tomcat);
		cats.add(tomcat);
		cats.add(jackcat);
		cats.add(johncat);
		
	    // 通过迭代器访问可以看到，Set不允许有重复元素。
	        Iterator<Cat> it = cats.iterator();
	        while(it.hasNext()) {
	           Cat cat = (Cat)it.next();
	           System.out.println(cat.getName());
	        }

	}
}
