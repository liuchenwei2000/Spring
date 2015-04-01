/**
 * 
 */
package bean.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import bean.Car;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月16日
 */
public class Bean {

	// 普通数组属性
	private String[] array;
	// 普通List属性
	private List<String> list;
	// 复合对象List属性
	private List<Car> cars;
	// 普通Set属性
	private Set<String> set;
	// 普通Map属性
	private Map<String, String> map;
	// 普复合对象Map属性
	private Map<String, Car> carMap;
	// 普通Properties属性
	private Properties properties;

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Map<String, Car> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Car> carMap) {
		this.carMap = carMap;
	}
}
