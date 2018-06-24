package cn.yel.interviews.io;

import java.util.Arrays;

/**
 * IO字节流和字符流的区别
 * ------------------
 * 字节流：一次读一位
 * 字符流：一次读一个char，所以是两个字节
 * @author Yel
 *
 */
public class IODemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String string = "你好";//你好 三个字符（UTF-8）两个字符（GBK） hello 五个字节
			byte[] bya = string.getBytes("GBK");
			System.out.println(Arrays.toString(bya));
			
			String result = new String(bya, "UTF-8");
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
