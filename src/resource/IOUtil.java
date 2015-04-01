/**
 * 
 */
package resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * IO工具类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年11月23日
 */
public class IOUtil {

	public static void print(File file){
		if(file.exists()){
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}else {
			throw new RuntimeException(file.getAbsolutePath() + " is not found.");
		}
	}
	
	public static void print(InputStream is) {
		InputStreamReader reader = null;
		try {
			reader = new InputStreamReader(is);
			int character = -1;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
