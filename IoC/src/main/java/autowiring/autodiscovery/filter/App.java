/**
 *
 */
package autowiring.autodiscovery.filter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/autodiscovery/filter/BeanFilter.xml");
        System.out.println("cat:" + context.getBean("cat"));
        System.out.println("dog:" + context.getBean("dog"));
        try {
            System.out.println("bird:" + context.getBean("bird"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
