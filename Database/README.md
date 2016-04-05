## Spring 与数据访问 ##

Spring 提供了一组数据访问框架，集成了多种数据访问技术。无论是直接通过 JDBC、MyBatis 或Hibernate，Spring 都能够消除持久化代码中单调枯燥的数据访问逻辑。

### Spring 数据访问的异常体系 ###

一方面，JDBC 的异常体系太普通，根本不算是一个体系，而另一方面，Hibernate 的异常体系又是私有的。Spring JDBC 提供的数据访问异常体系能够解决这两方面的问题。与 JDBC 相比，Spring 提供了多个数据访问异常，分别描述触发异常的问题；而又没有与任何特定持久化方式相关联，这意味着可以依靠 Spring 来抛出一致的异常集，而不必考虑使用的持久化技术。

Spring 的异常都源自 DataAccessException，它们全都是 RuntimeException，所以没有必要捕获 Spring 所抛出的数据访问异常（当然想捕获也完全可以）。
