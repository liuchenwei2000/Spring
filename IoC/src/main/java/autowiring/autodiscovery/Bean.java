package autowiring.autodiscovery;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 使用注解标注一个 Bean 类
 *
 * Created by liuchenwei on 2016/4/1.
 */
// Bean 的 id 默认为无限定类名（本例是 bean）
@Component
public class Bean {

    @Resource
    private Foo foo;
    @Resource(name = "kuc1")
    private Kuc kuc;

    @Override
    public String toString() {
        return "Bean{" +
                "foo=" + foo +
                ", kuc=" + kuc +
                '}';
    }
}
