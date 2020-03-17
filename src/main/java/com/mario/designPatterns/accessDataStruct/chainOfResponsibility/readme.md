# Handler 处理者

Handler角色定义了处理请求的接口（API）。Support类扮演该角色

# ConcreteHandler 具体的处理者

ConcreteHandler角色是处理请求的角色。**Support类扮演该角色。

# Client 请求者

Client角色是向第一个ConcreteHandler角色发送请求的角色。Main类扮演该角色。

# 特点

- 弱化了发出请求的人和处理请求的人之间的关系
- 可以动态地改变职责链
- 各个处理者专注于自己的工作
- 会有一定的处理延迟（不知道明确的处理者，为了找到合适的处理者只能按照职责链遍历）

# 相关的设计模式
- composite模式，Handler经常使用composite模式
- command模式，有时会使用command模式向Handler角色发送请求