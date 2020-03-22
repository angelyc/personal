# Mediator 仲裁者、中介者

Mediator角色负责定义与Colleague角色进行通信和作出决定的接口（API）。

# ConcreteMediator 具体的仲裁者、中介者

ConcreteMediator角色负责实现Mediator角色的接口（API），负责实际做出决定。

# Colleague 同事

Colleague角色负责定义与Mediator角色进行通信的接口（API）

# ConcreteColleague 具体的同事

ConcreteColleague 角色负责实现Colleague角色的接口（API）

# 特点

ConcreteColleague可以服用，而ConcreteColleague不能服用

# 相关的设计模式

- Facade模式：在Mediaor模式中Mediator角色和Colleague角色相互通信。而Facade模式中，Facade角色单方面地使用其他角色来对外提供高层接口（API）。因此，可以说Mediator模式是双向的，而Facade模式是单向的。
- Observe模式 有时会使用Observe模式来实现Mediator角色与Colleague角色直接的通信