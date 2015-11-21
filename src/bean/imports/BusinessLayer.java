/**
 * 
 */
package bean.imports;

/**
 * 模拟业务逻辑层
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年4月9日
 */
public class BusinessLayer {

	private DAO dao;// 使用DAO完成持久化

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
