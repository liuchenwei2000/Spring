## Spring与数据访问 ##

Spring 提供了一组数据访问框架，集成了多种数据访问技术。无论是通过直接的 JDBC、iBatis 或Hibernate，Spring 都能够消除数据持久代码中的麻烦，它会处理底层数据访问工作。

### Spring数据访问的异常体系 ###

一方面，JDBC 的异常体系太普通了，根本不算是一个体系，而另一方面，Hibernate 的异常体系又是私有的。

Spring JDBC 提供的数据访问异常体系能够解决这两方面的问题。与 JDBC 相比，Spring 提供了多个数据访问异常，分别描述触发异常的问题；而又没有与任何特定持久方式相关联，这意味着可以依靠 Spring 来抛出一致的异常集，而不必考虑使用的持久化技术。

Spring 的异常都源自 DataAccessException，它们全都是 RuntimeException。
