/**
 * 
 */
package test;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author 刘晨伟
 *
 * 创建日期：2015年11月19日
 */
@Component
public class User {

	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
