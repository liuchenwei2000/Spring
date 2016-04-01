package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>使用 @Autowired 注解进行自动装配（byType）的类</p>
 * <p>
 * Created by liuchenwei on 2016/4/1.
 */
public class Bean {

    private Foo foo;
    private Bar bar;
    private Baz baz;

    // 1，直接标注属性（不受限于 private 关键字），则该实例变量可以被自动装配
    @Autowired
    private Qux qux;

    // 2，标注构造器，表示当创建 Bean 时，即使在 XML 文件中没有使用
    // <constructor-arg> 元素配置 Bean，该构造器也需要进行自动装配。
    @Autowired
    public Bean(Foo foo) {
        this.foo = foo;
    }

    // 3，标注 setter 方法，会对该方法执行 byType 自动装配。
    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    // 4，标注需要自动装配 Bean 引用的任意方法
    @Autowired
    public void heresYourBaz(Baz baz) {
        this.baz = baz;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "foo=" + foo +
                ", bar=" + bar +
                ", baz=" + baz +
                ", qux=" + qux +
                '}';
    }
}
