# State 状态

State角色表示状态，定义了根据不同状态进行不同处理的接口（API）。

该接口（API）是那些处理内容依赖于状态的方法的集合。

# ConcreteState 具体状态

ConcreteState角色表示各个具体的状态，它实现了State接口。

# Context 状况、前后关系、上下文

Context角色持有表示当前状态的ConcreteState角色。此外，它还定义了供外部调用者使用State模式的接口（API）。

Context接口和SafeFrame类扮演此角色

# 相关设计模式

### Singleton 

Singleton模式经常会出现在ConcreteState角色中。

### Flyweight

在表示状态的类中并没有定义任何实例字段。因此，有时我们可以使用Flyweight模式在多个Context角色之间共享ConcreteState角色