/**
 * 
 */
package quickstart;

/**
 * ���϶���POJO
 * <p>
 * Spring�������Թ��������POJO������ǿ��Ҫ�󱻹�������Ǳ�׼JavaBean��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��26��
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
