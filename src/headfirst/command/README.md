# 理解命令模式

彻底的解耦的含义：

    1、调用者引用的是命令接口
    2、运行时期注入的是命令接口的实现类
    3、命令实现类中引用了具体的执行者
    4、调用者对象和执行者对象是完全解耦的
    
## 目录
- simpleremote
    - 简单遥控器实现
- simpleremoteWL
    - 使用lambd表达式简化代码
- remote
    - 实现遥控器
- remoteWL
    - 使用lambd表达式简化代码
- undo
    - 使用状态实现撤销
    - 实现多层次
- party
    - 宏命令执行一堆命令