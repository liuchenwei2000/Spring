/**
 * 
 */
package bean.scope.more;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class Worker {

	private Toy toy;

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}
	
	public void produce(){
		System.out.println("I am making toy��" + getToy());
	}
}
