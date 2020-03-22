# AbstractExpression 抽象表达式

 AbstractExpression角色定义了语法树节点共同的接口（API）。Node类扮演此角色
 
 # TerminalExpression 终结符表达式
 
 TerminalExpression角色对应BNF中的终结符表达式。PrimitiveCommandNode类扮演此角色
 
 # NonterminalExpression 非终结符表达式
 
 NonterminalExpression角色对应BNF中的非终结符表达式。ProgramNode类、CommandNode类、RepeatCommandNode类和CommandListNode类扮演此角色
 
 # Context 上下文
 
 Context角色为解释器进行语法分析提供了必要的信息。
 
 # Client 请求者
 
 为了推导语法树，Client角色会调用TerminalExpression角色和NonterminalExpression角色
 
 # 相关的设计模式
 
 ### Composite
 
 NonterminalExpression角色多少递归结构，因此常用Composite模式实现NonterminalExpression角色。
 
 ### Flyweight
 
 有时会使用Flyweight模式来共享TerminalExpression角色
 
 ### Visitor
 
 在推导出语法树后，有时会使用Visitor模式来访问语法树的各个节点。