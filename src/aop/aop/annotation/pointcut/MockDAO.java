/**
 * 
 */
package aop.annotation.pointcut;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��24��
 */
public class MockDAO {

	public void addString(String string){
		System.out.println("����һ���ַ�����" + string);
	}
	
	public void addInteger(Integer integer){
		System.out.println("����һ��������" + integer);
	}
	
	public void close(){
		realClose();
	}

	private void realClose() {
		System.out.println("�ر�����");
	}
}
