package autowiring.autodiscovery;

import org.springframework.stereotype.Component;

/**
 * <p></p>
 * <p>
 * Created by liuchenwei on 2016/4/1.
 */
// 指定 Bean id
@Component("kuc1")
public class Kuc {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kuc{" +
                "name='" + name + '\'' +
                '}';
    }
}
