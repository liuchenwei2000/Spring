/**
 * 
 */
package quickstart;

/**
 * �ӿ�ʵ�֣�POJO
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��10��26��
 */
public class Tape implements ITape {

	private String[] contents;
	
	public Tape() {
		this.contents = new String[]{
				"jingle bells, jingle bells", 
				"jingle all the way! ",
				"o what fun it is to ride",
				"in a one-horse open sleigh."
		};
	}

	public String[] songs() {
		return contents;
	}
}
