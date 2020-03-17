# Visitor 访问者

Visitor角色负责对数据结构中的每个具体元素（ConcreteElement角色）声明一个用于访问X的visit(X)方法

visit(X)是处理X的方法，负责实现该方法的是ConcreteVisitor角色。

# ConcreteVisitor 具体的访问者

ConcreteVisitor角色负责实现Visitor角色所定义的接口（API）。它要实现所有的visit(X)方法，即实现如何处理每个ConcreteElement角色

# Element 元素

Element角色表示Visitor角色的访问对象。

它声明了接受访问者的accept方法。accept方法接收到的参数是Visitor角色。

# ConcreteElement 

ConcreteElement角色负责实现Element角色所定义的接口（API）。File类和Directory类扮演了该角色

# ObjectStructure 对象结构

ObjectStructure角色负责处理Element角色的集合。

ConcreteVisitor角色为每个Element角色都准备了处理方法。

Directory类扮演了该角色（一人分饰两角）。为了让ConcreteVisitor角色可以遍历处理每个Element角色，在实例程序中，在Directory类中实现了iterator方法。

- 易于增加ConcreteVisitor角色
- 难于增加ConcreteElement角色：增加ConcreteElement角色需要在Visitor中声明新的visit(Y)方法，并在所有之类中实现这个方法

# 相关设计模式

### Iterator模式

- Iterator模式和Visitor模式都是在某种数据结构上进行处理
- Iterator模式用于逐个遍历保存在数据结构中元素
- Visitor模式用于对保存在数据结构中的元素进行某种特定处理

### Composite模式

- 有时访问者所访问的数据结构会使用Composite模式

### Interpreter模式

- 在Interpreter模式中有时会使用Visitor模式
