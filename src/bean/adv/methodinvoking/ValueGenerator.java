/**
 * 
 */
package bean.adv.methodinvoking;

/**
 * ���з���ֵ��������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��20��
 */
public class ValueGenerator {

	/**
	 * ����ֵ�ľ�̬����
	 */
	public static String genStaticString(){
		return "static";
	}
	
	/**
	 * ����ֵ�ķǾ�̬����
	 */
	public String genString(){
		return "non-static";
	}
	
	/**
	 * ����ֵ���в����ķǾ�̬����
	 */
	public String genString(String param) {
		return "non-static:" + param;
	}
}
