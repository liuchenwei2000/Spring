/**
 * 
 */
package bean;

/**
 * 接口实现，POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年10月26日
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
