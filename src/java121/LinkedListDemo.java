package java121;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

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
		
		// 新建一个LinkedList
	 LinkedList<Cat> stack=new LinkedList<Cat>();
	 
     // 元素压入栈中
     stack.push(tomcat);
     stack.push(jackcat);
     stack.push(johncat);
     stack.push(anncat);

     // 删除栈顶元素
     System.out.println("stack.pop():"+stack.pop().getName());

     // 取出栈顶元素
     System.out.println("stack.peek():"+stack.peek().getName());

	}
}
