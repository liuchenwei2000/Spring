package autowiring.annotation;

import javax.annotation.Resource;

/**
 * 使用 @Resource 注解进行自动装配（byName）的类<p>
 *
 * <li>@Autowired 与 @Resource 都可以用来自动装配 bean，都可以标注在字段上或 setter 方法上。
 * <li>@Autowired 默认按类型装配（这个注解是属于 Spring 自己的）。
 * <li>@Autowired 是 JDK1.6 支持的注解，默认按照名称进行装配，名称可以通过 name 属性进行指定。
 * 如果没有指定 name 属性，当注解标注在字段上时，默认取字段名进行装配；标注在 setter 方法上默认取属性名进行装配。
 * 当找不到与名称匹配的 bean 时才会按照类型进行装配。需要注意的是，如果 name 属性一旦指定，则只会按照名称进行装配。
 *
 * Created by liuchenwei on 2016/4/1.
 */
public class BeanResource {

    @Resource
    private Foo foo;
    private Bar bar;
    private Kuc kuc;

    @Resource
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Resource(name="kuc2")
    public void heresYourKuc(Kuc kuc) {
        this.kuc = kuc;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "foo=" + foo +
                ", bar=" + bar +
                ", kuc=" + kuc +
                '}';
    }
}
