/**
 * 
 */
package bean.lifecycle.destroy;

/**
 * POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��11��19��
 */
public class Item {

	private String name;

	public Item() {
		super();
		System.out.println("����һ��Itemʵ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}