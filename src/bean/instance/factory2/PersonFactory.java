/**
 * 
 */
package bean.instance.factory2;

/**
 * ����IPersonʵ���Ĺ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��17��
 */
public class PersonFactory {

	/**
	 * ����ʵ�������ݲ���������Ӧ��IPersonʵ��
	 */
	public IPerson create(String type) {
		if ("usa".equals(type.toLowerCase())) {
			return new American();
		} else if ("cn".equals(type.toLowerCase())) {
			return new Chinese();
		}
		return null;
	}
}
