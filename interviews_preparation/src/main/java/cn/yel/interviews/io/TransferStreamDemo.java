package cn.yel.interviews.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 转换流Reader和Writer For InputStreamReader, An InputStreamReader is a bridge from
 * byte streams to character streams. but for OutputStreamWriter,An
 * OutputStreamWriter is a bridge from character streams to byte streams:
 * Characters written to it are encoded into bytes using a specified
 * charset(字符的输出类型根据字符输入的类型相同，否则会出现乱码的问题)
 * 
 * @author Yel
 *
 */
public class TransferStreamDemo {

	public static void main(String[] args) throws Exception {
		OutputStreamWriter osw = null;
		try {
			// osw = new OutputStreamWriter(new
			// FileOutputStream("/Users/Yel/Desktop/aa.txt"), "GBK");
			osw = new OutputStreamWriter(new FileOutputStream("/Users/Yel/Desktop/aa.txt"), "UTF-8");
			// 使用append的方式添加到file的结尾

			osw.write("try中文");
			osw.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (osw != null) {
				osw.close();
			}

		}
	}
}
