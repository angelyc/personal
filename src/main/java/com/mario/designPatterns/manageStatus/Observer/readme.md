# Subject 观察对象

Subject角色表示观察对象。Subject角色定义了注册观察者和删除观察者的方法。此外它还声明了“获取现在状态”的方法。

# ConcreteSubject 具体的观察者

ConcreteSubject角色表示具体的被观察对象。当自身状态发生变化后，它会通知所有已向它注册的Observer角色

# Observer 观察者

Observer角色负责接收来自Subject角色的状态变化的通知。为此，它声明了update方法

# ConcreteObserver 具体的观察者

ConcreteObserver角色表示具体的Observer。当它的update方法被调用后，会去获取被观察对象的最新状态

#特点

- 利用抽象类和接口从具体类中抽象出方法
- 将实例作为参数传递到类中,或者在类的字段中保存实例时,不使用具体的类型,而是使用抽象类型和接口.这样的实现可以帮我们轻松替换具体类.
