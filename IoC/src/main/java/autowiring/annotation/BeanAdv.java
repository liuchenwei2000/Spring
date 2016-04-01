package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <p>使用 @Autowired 注解进行自动装配的类</p>
 * <p>
 * 可选的自动装配、限定歧义性的依赖
 * <p>
 * Created by liuchenwei on 2016/4/1.
 */
public class BeanAdv {

    /*
    * 默认情况下，@Autowired 具有强契约特性，其所标注的属性或参数必须是可装配的。
    * 如果没有 Bean 可以装配到其所标注的属性或参数中，自动装配就会失败（抛出异常）。
    *
    * 属性不一定非要装配，null 值也是可以接受的，在这种场景下，可以通过设置
    * @Autowired 的 required 属性为 false 来配置自动装配是可选的。
    *
    * Spring 会尝试装配 foo 属性，如果没有找到与之匹配的类型为 Foo 的 Bean，
    * 则不会抛出异常，而是将该属性值设置为 null。
    *
    * required 属性可以用于 @Autowired 注解所使用的任意地方，但是当使用构造器装配时，
    * 只有一个构造器可以将 @Autowired 的 required 属性设置为 true。
    */
    @Autowired(required = false)
    private Foo foo;

    /*
    * 当有多个 Bean 都完全满足装配条件时，可以使用 @Qualifier 注解进行鉴别。
    * 使用 @Qualifier 可以明确指定被装配 Bean 的名称（id），本例需要注入 id 为 kuc2 的 Bean。
    * 这意味着 @Qualifier 把 @Autowired 的 byType 自动装配转换为显式的 byName 装配。
    */
    @Autowired
    @Qualifier("kuc2")
    private Kuc kuc;

    @Override
    public String toString() {
        return "BeanAdv{" +
                "foo=" + foo +
                ", bar=" + kuc +
                '}';
    }
}
