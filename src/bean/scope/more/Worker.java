/**
 * 
 */
package bean.scope.more;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月19日
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
		System.out.println("I am making toy：" + getToy());
	}
}
