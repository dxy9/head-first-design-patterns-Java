package headfirst.iterator.dinermergeri;
 
import java.util.Iterator;
  
public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * TODO 这边删除的逻辑没搞明白
	 * 1,remove是从之前的集合中删除,如果是删除多个元素呢?
	 * 2,
	 */
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		// TODO 这边感觉没有必要进行为空的判断啊
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}
