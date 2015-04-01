/**
 * 
 */
package aop.annotation.pointcut;

/**
 * POJO
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月24日
 */
public class MockDAO {

	public void addString(String string){
		System.out.println("新增一个字符串：" + string);
	}
	
	public void addInteger(Integer integer){
		System.out.println("新增一个整数：" + integer);
	}
	
	public void close(){
		realClose();
	}

	private void realClose() {
		System.out.println("关闭连接");
	}
}
