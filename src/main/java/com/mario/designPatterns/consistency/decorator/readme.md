# Component

增加功能时的核心角色。由Display类扮演

# ConcreteComponent 

该角色实现了Component角色所定义的接口（API）。由StringDisplay扮演

# Decorator 装饰物

该角色具有与Component角色相同的接口（API）。在它内部保存了被装饰对象----Component角色

Decorator角色知道自己要装饰的对象。由Border对象扮演

# ConcreteDecorator 具体的装饰物 

该角色是具体的Decorator。由SideBorder和FullBorder类扮演