## Spring 简介 ##

Spring 是一个开源框架，它是为了解决企业应用开发的复杂性而创建的。然而，Spring 的用途不仅限于服务器端的开发，任何 Java 应用都能在简单性、可测试性和松耦合等方面从 Spring 中受益。

Spring 的核心是控制反转（IoC）和面向切面（AOP），它们为 JavaBean 提供了之前 EJB 才能拥有的强大功能。这些技术为 POJO 提供了类似 EJB 的声明式编程模型，却没有引入任何 EJB 的复杂性。简单来说，Spring 是一个分层的 JavaSE/EE full-stack（全栈）轻量级开发框架。

Spring 的目标致力于全方位的简化 Java 开发，采取了以下4种关键策略：

* 基于 POJO 的轻量级和最小侵入性编程
* 通过依赖注入和面向接口实现松耦合
* 基于切面和约定进行声明式编程
* 通过切面和模板减少样板式代码

### 轻量 ###

从大小与开销两方面而言 Spring 都是轻量的。完整的 Spring 框架可以在一个大小只有 1MB 多的 JAR 文件里发布，并且 Spring 所需的处理开销也是微不足道的。

此外，Spring 是非侵入式的：典型地，Spring 应用中的对象不依赖于 Spring 的特定类。

### 控制反转 ###

Spring 通过一种称作控制反转（IoC）的技术促进了低耦合。当应用了 IoC，一个对象依赖的其它对象会通过被动的方式传递进来，而不是这个对象自己创建或者查找依赖对象。可以认为 IoC 与 JNDI 相反————不是对象从容器中查找依赖，而是容器在对象初始化时不等对象请求就主动将依赖传递给它。

### 面向切面 ###

Spring 提供了面向切面编程的丰富支持，允许通过分离应用的业务逻辑与系统级服务（例如审计（auditing）和事务（transaction）管理）进行内聚性的开发。

应用对象只实现它们应该做的——完成业务逻辑——仅此而已。它们并不负责（甚至是意识）其它的系统级关注点，例如日志或事务支持。

### 容器 ###

Spring 包含并管理应用对象的配置和生命周期，在这个意义上它是一种容器，可以配置每个 bean 如何被创建——基于一个可配置原型（prototype），bean 可以创建一个单独的实例或者每次需要时都生成一个新的实例——以及它们是如何相互关联的。然而，Spring 不应该被混同于传统的重量级的 EJB 容器，它们经常是庞大与笨重的，难以使用。

### 框架 ###

Spring 可以将简单的组件配置、组合成为复杂的应用。在 Spring 中，应用对象被声明式地组合，典型地是在一个 XML 文件里。

Spring也提供了很多基础功能（事务管理、持久化框架集成等等），将应用逻辑的开发留给了你。

### 使用Spring的好处 ###

* 方便解耦，简化开发

	通过 Spring 提供的 IoC 容器，可以将对象之间的依赖关系交由 Spring 进行控制，避免硬编码所造成的过度程序耦合。

	有了 Spring，用户不必再为单实例模式类、属性文件解析等这些很底层的需求编写代码，可以更专注于上层的应用。

* AOP编程的支持

	通过 Spring 提供的 AOP 功能，方便进行面向切面的编程，许多不容易用传统 OOP 实现的功能可以通过 AOP 轻松应付。

* 声明式事务的支持

	在 Spring 中，可以从单调烦闷的事务管理代码中解脱出来，通过声明式方式灵活地进行事务的管理，提高开发效率和质量。

* 方便程序的测试

	可以用非容器依赖的编程方式进行几乎所有的测试工作，在 Spring 里，测试不再是昂贵的操作，而是随手可做的事情。
	
	例如：Spring 对 JUnit4 支持，可以通过注解方便的测试 Spring 程序。

* 方便集成各种优秀框架
 
	Spring 不排斥各种优秀的开源框架，相反，Spring 可以降低各种框架的使用难度，Spring 提供了对各种优秀框架（如 Struts、Hibernate、Hessian、Quartz）等的直接支持。

* 降低 Java EE API 的使用难度

	Spring 对很多难用的 Java EE API（如JDBC，JavaMail，远程调用等）提供了一个薄薄的封装层，通过 Spring 的简易封装，这些 Java EE API 的使用难度大为降低。

* Java 源码是经典学习范例

	Spring 的源码设计精妙、结构清晰、匠心独用，处处体现着大师对 Java 设计模式灵活运用以及对Java 技术的高深造诣。Spring 框架源码无疑是 Java 技术的最佳实践范例。如果想在短时间内迅速提高自己的 Java 技术水平和应用开发水平，学习和研究 Spring 源码将会使你收到意想不到的效果。
