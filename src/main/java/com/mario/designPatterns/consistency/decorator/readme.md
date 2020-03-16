# Component

增加功能时的核心角色。由Display类扮演

# ConcreteComponent 

该角色实现了Component角色所定义的接口（API）。由StringDisplay扮演

# Decorator 装饰物

该角色具有与Component角色相同的接口（API）。在它内部保存了被装饰对象----Component角色

Decorator角色知道自己要装饰的对象。由Border对象扮演

# ConcreteDecorator 具体的装饰物 

该角色是具体的Decorator。由SideBorder和FullBorder类扮演

# 相关的设计模式

### Adapter 模式

- Decorator模式可以在不改变被装饰物的接口（API）的前提下，为装饰物添加边框（透明性）。
- Adapter用于适配两个不同的接口（API）。

- Strategy 模式

- Decorator模式可以像改变装饰物的边框或是为被装饰物添加多重边框那样，来增加类的功能
- Strategy模式通过整体地替换算法来改变类的功能