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
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��16��
 */
public class Bean {

	// ��ͨ��������
	private String[] array;
	// ��ͨList����
	private List<String> list;
	// ���϶���List����
	private List<Car> cars;
	// ��ͨSet����
	private Set<String> set;
	// ��ͨMap����
	private Map<String, String> map;
	// �ո��϶���Map����
	private Map<String, Car> carMap;
	// ��ͨProperties����
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
