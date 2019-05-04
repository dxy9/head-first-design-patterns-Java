# 抽象工厂的理解


生产pizza的这个例子,融入了一些其他的知识,不完全是抽象工厂

## 角色
- Pizza (抽象类)
    - 具体产品
- PizzaStore (抽象类)
    - pizza店
- ingredientFactory (接口)
    - 原料工厂
- Cheese etc (芝士)
    - 原料
    
    
## 理解
- 商店orderPizza
- 工厂方法模式 处理createPizza
- store实现类通过组合持有pizza抽象父类引用
    - 局部变量
- pizza实现类需要原料工厂才能实例化
- 原料工厂的实现类就是一个产品组