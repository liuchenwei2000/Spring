/**
 * 
 */
package transaction.declarative;

import org.springframework.transaction.TransactionDefinition;

/**
 * ���뼶��ʾ��
 * <p>
 * ���뼶��isolation level��������һ�����������������������Ӱ��ĳ̶ȡ�
 * <p>
 * ������񲢷����У������������ͬ����������ɸ��Ե�������˻ᵼ���������⣺
 * <li>1�������Dirty read��
 * ���������һ�������ȡ����һ�������д����δ�ύ������ʱ�������д���Ժ󱻻ع��ˣ���ô��һ�������ȡ�����ݾ�����Ч�ġ�
 * <li>2�������ظ�����Nonrepeatable read��
 * �����ظ���������һ������ִ����ͬ�Ĳ�ѯ���λ��������ϣ�����ÿ�ζ��õ���ͬ������ʱ����ͨ������Ϊ��һ���������������β�ѯ�ڼ���������ݡ�
 * <li>3�������Phantom read��
 * ����Ͳ����ظ������ơ���������һ�������ȡ�˼������ݣ�������һ���������������һЩ���ݣ������Ĳ�ѯ�У���һ������ᷢ�ֶ���һЩ���������ڵļ�¼��
 * <p>
 * ���������£�����֮������ȫ����ģ��Ӷ����Է�ֹ��Щ���ⷢ����������ȫ����ᵼ���������⣬��Ϊ��ͨ�����������ݿ��еļ�¼���谭�����ԡ�
 * ͬʱ�����������е�Ӧ�ó�����Ҫ��ȫ�ĸ��룬������Ҫ�������������һ��������ԣ�������˶��ָ��뼶��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��12��4��
 */
public class IsolationLevel {

	/**
	 * ʹ�ú�̨���ݿ�Ĭ�ϵĸ��뼶��
	 */
	public static final int DEFAULT = TransactionDefinition.ISOLATION_DEFAULT;
	
	/**
	 * �����ȡ��δ�ύ�����ݱ�������ܻᵼ�����������Ͳ����ظ�����
	 */
	public static final int READ_UNCOMMITTED = TransactionDefinition.ISOLATION_READ_UNCOMMITTED;
	
	/**
	 * �����ȡ���������Ѿ��ύ�����ݣ����Է�ֹ�������������Ͳ����ظ������п��ܷ�����
	 */
	public static final int READ_COMMITTED = TransactionDefinition.ISOLATION_READ_COMMITTED;
	
	/**
	 * ��ͬһ�е����ݶ�ζ�ȡ�����һ�µģ����������Ǳ��������Լ����޸ġ�
	 * ������ֹ����Ͳ����ظ�������������п��ܷ�����
	 */
	public static final int REPEATABLE_READ = TransactionDefinition.ISOLATION_REPEATABLE_READ;

	/**
	 * ��ȫ����ACID�ĸ��뼶��ȷ������������������ظ����������
	 * ����������������뼶����Ϊ��ͨ����ͨ����ȫ����������ص����ݱ���ʵ�ֵġ�
	 */
	public static final int SERIALIZABLE = TransactionDefinition.ISOLATION_SERIALIZABLE;
}
