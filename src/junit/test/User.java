/**
 * 
 */
package test;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author ����ΰ
 *
 * �������ڣ�2015��11��19��
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
