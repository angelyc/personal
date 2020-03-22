# Command 命令

Command角色负责定义命令的接口（API）

# ConcreteCommand 具体的命令

ConcreteCommand角色负责实现在Command角色中定义的接口（API）

MacroCommand类和DrawCommand类扮演此角色

# Receiver 接收者

Receiver 角色是Command角色执行命令时的对象

DrawCommand类和DrawCanvas类扮演此角色

# Client 请求者

Client角色负责生成ConcreteCommand角色并分配Receive角色。

Main类扮演此角色。 在响应鼠标拖拽事件时，它生成了DrawCommand类的实例。并将扮演Receive角色的DrawCanvas类的实例传递给了DrawCommand类的构造函数。
# Invoker 发动者

Invoker角色是开始执行命令的角色，它会调用在Command角色中定义的接口（API）

Main类和DrawCanvas类扮演此角色

# 相关的设计模式

### Composite 

有时会使用composite模式实现MacroCommand

### Memento

有时会使用Memento模式保存Command角色的记录

### Protype

有时会使用Protype模式复制发生的事件（生成的命令）
