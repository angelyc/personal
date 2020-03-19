#  Originator 生成者

Originator生成者角色会在保存自己的最新状态时生成Memento角色。当把以前保存的Memento角色传递给Originator角色时，它会将自己恢复至生成该Mement角色时的状态。

Gamer扮演该角色

# Memento 纪念品

Memento角色会将Originator角色的内部信息整合在一起。在Memento角色中虽然保存了Originator角色的信息，但它不会向外公开这些信息

Memento角色有以下两种接口（API）

### wide interface 宽接口（API）

Memento角色提供的“宽接口（API）”是指所有用于获取恢复对象状态信息的方法的集合。由于宽接口（API）会暴露所有Memento角色的内部信息，因此能够使用宽接口（API）的只有Originator角色

### narrow interface 窄接口

Memento角色为外部的Caretaker角色提供了“窄接口（API）”。可以通过窄接口（API）获取的Memento角色的内部信息非常有限，因此可以有效地防止信息泄露

通过以上两种接口（API），可以有效地防止对象的封装性被破坏

# Caretaker 负责人

当Caretaker角色想要保存当前的Originator角色的状态时，会通知Originator角色。Originator角色在收到通知后会生成Memento角色的实例并将其返回给Caretaker角色。由于以后可能会用Memento实例来将Originator角色恢复至原来的状态，因此Caretaker角色会一直保存Memento实例

# 相关设计模式

### Command模式

在使用Command模式时，可以使用Memento模式实现撤销功能

### Protype模式

在Memento模式中想要实现快照和撤销功能，保存了对象当前的状态。保存的信息只是在恢复状态时所需要的那部分信息。

而在Protype模式中，会生成一个与当前实例完全相同的另一个实例。这两个实例的内容完全相同。

### State模式
在Memento模式中，是用“实例”表示状态。
而在State模式中，则是用“类”表示状态。