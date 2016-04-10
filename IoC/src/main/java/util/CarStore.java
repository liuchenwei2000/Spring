package util;

import bean.alias.Car;

/**
 * 本类是纯净的 POJO，并没有被 Spring 管理。
 *
 * @author liuchenwei
 * @date 2016/4/10
 * @since 1.0
 */
public class CarStore {

    public Car getCar(){
        // 通过 SpringUtil 获取 Spring 容器管理的 Bean
        return (Car) SpringUtil.getBean("car");
    }
}
