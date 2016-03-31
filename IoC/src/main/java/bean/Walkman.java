/**
 * 
 */
package bean;

/**
 * 复合对象，POJO
 * <p>
 * Spring容器可以管理任意的POJO，并不强制要求被管理组件是标准JavaBean。
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年10月26日
 */
public class Walkman {

	private String name;
	private ITape tape;

	public Walkman(String name) {
		super();
		this.name = name;
	}
	
	public Walkman(String name, ITape tape) {
		this.name = name;
		this.tape = tape;
	}

	public void start() {
		System.out.println("Hello, I'm a walkman " + name);
		if (tape != null) {
			String[] songs = tape.songs();
			for (String song : songs) {
				System.out.println(song);
			}
		}
	}

	public void setTape(ITape tape) {
		this.tape = tape;
	}
}
