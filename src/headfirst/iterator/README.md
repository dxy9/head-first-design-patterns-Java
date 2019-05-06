# 迭代器

## 项目顺序
- dinermerger
    - 使用自定义的迭代器接口
- dinermergeri
    - 使用jdk提供的iterator接口
- dinermergercafe
    - 收购咖啡厅
    
# 角色

- Menu
    - 具体菜单,存放菜单项数据
- Iterator
    - 菜单的迭代器
- Waitress
    - 需要透明的获取菜单项数据
- MenuItem
    - 菜单项
    
# iterator 删除
- next()方法移动指针
- 删除的是移动指针之前的元素
- 将后面的元素逐个前移