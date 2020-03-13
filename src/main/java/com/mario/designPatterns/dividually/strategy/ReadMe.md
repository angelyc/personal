# Strategy 策略

Strategy角色负责决定实现策略所必须的接口（API）

# ConcreteStrategy 具体的策略

ConcreteStrategy角色负责实现Strategy角色的接口（API），即负责实施具体的策略

# Context 上下文

负责使用Strategy角色，Context角色保存了ConcreteStrategy角色的实例，并使用ConcreteStrategy角色去实现需求