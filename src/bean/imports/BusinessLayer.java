/**
 * 
 */
package bean.imports;

/**
 * ģ��ҵ���߼���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��4��9��
 */
public class BusinessLayer {

	private DAO dao;// ʹ��DAO��ɳ־û�

	public BusinessLayer() {
		super();
	}

	public BusinessLayer(DAO dao) {
		super();
		this.dao = dao;
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public void doOperation() {
		System.out.println("do some operation using " + dao);
	}
}
