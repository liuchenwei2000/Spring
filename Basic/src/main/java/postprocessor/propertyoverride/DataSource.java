/**
 * 
 */
package postprocessor.propertyoverride;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月21日
 */
public class DataSource {
	
	private String driver;
	private String url;
	private String username;
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataSource [driver=" + driver + ", url=" + url + ", username="
				+ username + ", password=" + password + "]";
	}
}
