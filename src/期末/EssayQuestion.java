package 期末;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import java.io.*;

public class EssayQuestion {
	private String Ques;
	private String Ans;

	public EssayQuestion() {
	}

	public EssayQuestion(String Ques, String Ans) {
		super();
		this.Ques = Ques;
		this.Ans = Ans;
	}

	public void setQues(String ques) {
		this.Ques = ques;
	}

	public void setAns(String ans) {
		this.Ans = ans;
	}

	public String getQues() {
		return Ques;
	}

	public String getAns() {
		return Ans;
	}

	// 读入题目
	public void QuestionIN() {
		FileReader f;
		try {
			f = new FileReader("data/timu.json");
			JSONReader jsonReader = new JSONReader(f);
			jsonReader.startArray();
			while (jsonReader.hasNext()) {
				String s = jsonReader.readObject().toString();
				EssayQuestion temp = JSON.parseObject(s, EssayQuestion.class);
				information.questions.add(temp);
			}
			jsonReader.endArray();
			jsonReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 判断答案正确
	public boolean Judge(String ans, int i) {
		return ans.equals(information.questions.get(i).getAns());
	}

}
