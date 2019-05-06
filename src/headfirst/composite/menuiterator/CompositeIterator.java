package headfirst.composite.menuiterator;

import java.util.*;
  
public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
   
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
   
	public MenuComponent next() {
		// 这边的if判断为什么是有必要的？ TODO
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			// 把MenuItem也推入到栈顶当中
			// 一种是为null=>判断不是null再存入栈顶
			// 一种是返回NoIterator=>当调用hasNext方法永远返回false=>使这个迭代器无用=>这样比较好? TODO
			stack.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


