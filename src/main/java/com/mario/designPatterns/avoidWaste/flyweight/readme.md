# Flyweight 轻量级

按照通常方式编写程序会导致程序变重，所以如果能够共享实例会比较好。

而Flyweight角色表示的就是那些实例会被共享的类。BigChar扮演了该角色

# FlyweightFactory 轻量级工厂

FlyweightFactory角色是生成Flyweight角色的工厂。在工厂中生成Flyweight可以实现共享实例

# Client 请求者

Client角色使用FlyweightFactory角色来生成Flyweight角色。

# 相关的设计模式

### Proxy模式

如果生成实例的处理需要花费较长时间，那么使用Flyweight模式可以提高程序的处理速度。

而Proxy模式则是通过设置代理提高程序的运行速度

### Composite 模式

有时可以使用Flyweight模式共享Composite模式的Leaf角色

### Singleton 模式

在FlyweightFactory角色中有时会使用Singleton模式。

此外，如果使用了Singleton模式，由于只会生成一个Singleton角色，因此所有使用该实例的地方都共享同一个实例。在Singleton角色的实例中只持有intrinsic信息