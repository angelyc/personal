# Facade 窗口

Facade角色是代表构成系统的许多其他角色的“简单窗口”。

Facade角色向系统外部提供高层接口（API）。PageMaker类扮演此角色

# 构成系统的许多其他角色

这些角色各自完成自己的工作，它们并不知道Facade角色。

Facade角色调用其他角色进行工作，但是其他角色不会调用Facade角色

Database类和HtmlWriter类扮演此角色。

# Client 请求者

Client角色负责调用Facade角色。

# 特点

Facade模式可以让复杂的东西看起来简单。这里说的“复杂的东西”就是后台工作的这些类之间的关系以及它们的使用方法。

使用Facade模式可以让我们不必在意这些复杂的东西。

这里的重点是接口（API)变少了。程序中如果有很多类和方法，我们在决定到底该使用哪个类或方法时就很容易迷茫。有时，类和方法的调用顺序也很容易弄错，必须格外注意。因此，如果有一个能够使接口（API）变少的Facade角色是一件多么美好的事情呀。

接口(API)变少了还以为着程序与外部的关联关系弱化了，这样更容易使我们的包（类的集合）作为组件被复用

# 相关的设计模式

- Abstract Factory 模式：可以将Abstract Factory模式看作生成复杂实例时的Facade模式。因为它提供了“想要生成这个实例只需调用这个方法就OK了”的简单接口
- Singleton 模式：有时会使用Singleton模式创建Facade角色。
- Mediator 模式：在Facade模式中，Facade角色单方面地使用其他角色来提供高层接口（API）。
而在Mediator模式中，Mediator角色做为Colleague角色间的仲裁者负责调停。可以说，Facade模式是单向的，而Mediator模式是双向的。