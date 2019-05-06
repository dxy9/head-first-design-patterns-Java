# 理解组合模式

# 组件
- MenuComponent
    - 组件抽象父类
- Menu
    - Node节点
- MenuItem
    - Leaf节点
- Waitress
    - 客户端
    
# 使用
- 组合allMenus
    - 将所有的Node和Leaf节点放到一个Node节点里面
- 调用Print
    - **使用递归实现**
    
### 树形结构是怎么出来的


### 复合迭代器的实现
1 当进行迭代的时候每次都会调用hasNext方法，为什么这边还需要判断？

        public MenuComponent next() {
            // 这边的if判断为什么是有必要的？ TODO
            if (hasNext()) {
                Iterator<MenuComponent> iterator = stack.peek();
                MenuComponent component = iterator.next();
                stack.push(component.createIterator());
                return component;
            } else {
                return null;
            }
        }
2 null 不是Object类型
        
        public static void main(String[] args) {
            System.out.println(null instanceof Object);
        }
        
3 使用迭代器模式遍历一棵树
- 每一个节点都是一个Iterator
- 需要将所有的Iterator保存,依次遍历
- 如何将外层iterator的hasNext和next方法跟内层iteratro的hasNext和next方法结合
- 如何控制iterator的流程和递归的流程

4 stack堆栈结构的深度跟树的深度有关,跟树的广度无关

5 NoIterator

6 try Catch
