package headfirst.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author linhaicheng on 2019/05/05
 */
public class iteratortest {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            iterator.remove();
        }
    }
}
