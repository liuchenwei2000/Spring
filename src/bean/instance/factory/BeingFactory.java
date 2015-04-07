/**
 * 
 */
package bean.instance.factory;

/**
 * ����IBeingʵ���ľ�̬����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��17��
 */
public class BeingFactory {

	/**
	 * ��̬���������ݲ���������Ӧ��IBeingʵ��
	 */
	public static IBeing create(String type) {
		if ("dog".equals(type.toLowerCase())) {
			return new Dog();
		} else if ("cat".equals(type.toLowerCase())) {
			return new Cat();
		}
		return null;
	}
}
