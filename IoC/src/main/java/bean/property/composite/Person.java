/**
 * 
 */
package bean.property.composite;

import bean.alias.Car;

/**
 * 复合Bean
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月17日
 */
public class Person {

	private String name;
	private Car car;
	
	public Person(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
