package headfirst.composite.menuiterator;

import java.util.Iterator;
  
public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			// TODO 使用异常处理逻辑的例子
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
				//捕获Menu类型的不支持i是Vegetarian的异常
				//还有一种做法是在Menu中实现Vegetarian方法,返回false
				//还有一种方法是先使用instanceof进行判断
			} catch (UnsupportedOperationException e) {}
		}
	}
}
