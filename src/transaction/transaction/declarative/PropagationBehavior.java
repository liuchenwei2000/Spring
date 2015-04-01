/**
 * 
 */
package transaction.declarative;

import org.springframework.transaction.TransactionDefinition;

/**
 * ������Ϊʾ��
 * <p>
 * ������Ϊ������ڿͻ��˺ͱ����÷���������߽磬���ھ���һ���µ�����Ӧ�ñ��������Ǳ����𣬻�����һ�������Ƿ�Ӧ�����������������н��С�
 * Spring������7�ֽ�Ȼ��ͬ�Ĵ�����Ϊ�����Ƿֱ��Ӧ��EJB��������������CMT���еĴ�������
 * ����Spring�� PROPAGATION_REQUIRES_NEW��ͬ��CMT��Requires_New��
 * Spring������������һ��CMT����û�еĴ�����Ϊ��PROPAGATION_NESTED����֧��Ƕ��ʽ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��4��
 */
public class PropagationBehavior {
	
	/**
	 * ����˵����
	 * ���һ������������Ϊͨ�� PROPAGATION_REQUIRES_NEW��Ϊ������������ô����ζ������߽�������������ı߽���һ���ģ�
	 * һ���µ��������Ÿ÷����Ŀ�ʼ���������������Ÿ÷������ػ��׳�һ���쳣��������
	 * ����������������PROPAGATION_REQUIRED��Ϊ����ô����߽罫ȡ�����Ƿ��Ѿ���һ�������������С�
	 */

	/**
	 * ��ʾ�÷������������������У������ǰ���񲻴��ڣ�����׳�һ���쳣��
	 */
	public static final int MANDATORY = TransactionDefinition.PROPAGATION_MANDATORY;
	
	/**
	 * ��ʾ�����ǰ�Ѿ�����һ��������ô�÷���������Ƕ�����������С�Ƕ�׵�������Զ����ڵ�ǰ������е������ύ��ع���
	 * �����ǰ���񲻴��ڣ���ô����Ϊ��PROPAGATION_REQUIREDһ����ע������̶����ִ�����Ϊ��֧������������ġ�
	 */
	public static final int NESTED = TransactionDefinition.PROPAGATION_NESTED;
	
	/**
	 * ��ʾ��ǰ������Ӧ�������������������У������ǰ����һ�����������У�����׳��쳣��
	 */
	public static final int NEVER = TransactionDefinition.PROPAGATION_NEVER;
	
	/**
	 * ��ʾ�÷�����Ӧ�������������У������ǰ������ڣ����ڸ÷��������ڼ䣬��ǰ���񽫱�����
	 */
	public static final int NOT_SUPPORTED = TransactionDefinition.PROPAGATION_NOT_SUPPORTED;
	
	/**
	 * ��ʾ�÷������������������У������ǰ������ڣ����������ڸ����������У����򣬻�����һ���µ�����
	 */
	public static final int REQUIRED = TransactionDefinition.PROPAGATION_REQUIRED;
	
	/**
	 * ��ʾ�÷����������������Լ��������У�һ���µ����񽫱�������������ڵ�ǰ�����ڸ÷���ִ���ڼ䣬��ǰ����ᱻ����
	 */
	public static final int REQUIRES_NEW = TransactionDefinition.PROPAGATION_REQUIRES_NEW;
	
	/**
	 * ��ʾ�÷�������Ҫ���������ģ���������ڵ�ǰ����Ļ�����ô�÷�������������������С�
	 */
	public static final int SUPPORTS = TransactionDefinition.PROPAGATION_SUPPORTS;
}
