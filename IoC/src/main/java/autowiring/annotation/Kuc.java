package autowiring.annotation;

/**
 * <p></p>
 * <p>
 * Created by liuchenwei on 2016/4/1.
 */
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
