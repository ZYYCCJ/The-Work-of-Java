package 期末;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import java.io.*;

public class Reader {
	private String Info;

	public Reader() {
	}

	public Reader(String Info) {
		super();
		this.Info = Info;
	}

	public void setInfo(String info) {
		this.Info = info;
	}

	public String getInfo() {
		return Info;
	}

	// 读入资料
	public void InfoIN() {
		FileReader f;
		try {
			f = new FileReader("data/reader.json");
			JSONReader jsonReader = new JSONReader(f);
			jsonReader.startArray();
			while (jsonReader.hasNext()) {
				String s = jsonReader.readObject().toString();
				Reader temp = JSON.parseObject(s, Reader.class);
				information.read.add(temp);
			}
			jsonReader.endArray();
			jsonReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
