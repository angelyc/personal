# Subject 主体

subject角色定义了使用Proxy角色和RealSubject角色之间具有一致性的接口。

由于存在Subject角色，所以Client角色不必在意它使用的究竟是Proxy角色还是RealSubject角色。

Printable接口扮演此角色

# Proxy 代理人

Proxy角色会尽量处理来自Client角色的请求。只有当自己不能处理时，它才会将工作交给RealSubject角色。

Proxy角色只有在必要时才会生成RealSubject角色。

Proxy角色实现了在Subject角色中定义的接口（API）。

PrinterProxy扮演此角色

# RealSubject 实际的主体

“本人”RealSubject角色会在“代理人”Proxy角色无法胜任工作时出场。

它与Proxy角色一样，也实现了Subject角色中定义的接口（API）

Printer扮演此角色

# Client 请求者

使用Proxy模式的角色。

# 相关设计模式 

### Adapter

- Adapter模式适配了两种具有不同接口（API）的对象，以使它们可以一同工作。
- Proxy模式中，Proxy角色与RealSubject角色的接口（API）是相同的（透明性）。

### Decorator 模式

- Decorator 模式与Proxy 模式在实现上很相似，不过它们的使用目的不同。
- Decorator 模式的目的在于增加新的功能。而在Proxy模式中，与增加新功能相比，它更注重通过设置代理人的方式来减轻本人的工作负担。