package 期末;

import java.util.Scanner;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.JSONException;
import java.io.*;

public class Test {
	int maxsize = 100;
	int Srank[] = new int[maxsize + 1];
	String s1 = "";
	String s2 = "";
	Scanner input = new Scanner(System.in);
	UserManage UM = new UserManage();
	EssayQuestion EQ = new EssayQuestion();
	Reader RE = new Reader();

	// 输出换行
	public void p(Object obj) {
		System.out.println(obj);
	}

	// 输出=================
	public void line() {
		p("================================================================================");
	}

	// 登录界面
	public boolean login() {
		int t = login_in();
		if (t == 0) {
			System.out.println("您的账号或密码错误，请重新输入！");
			line();
			login();
		} else if (t == 1) {
			menu();
		} else if (t == 2) {
			add();
		} else if (t == 3) {
			p("指令错误，请重新输入！");
			line();
			login();
		}
		return false;
	}

	// 程序应用界面
	public void menu() {
		p("				===============");
		p("				====1.题目问答===");
		p("				====2.阅读党史===");
		p("				====3.积分排名===");
		p("				====4.密码修改===");
		p("				====5.退出账户===");
		p("				====0.退出======");
		p("				===============");
		start();
	}

	// 答题应用界面
	public void question(int s) {
		p("				====0.答题==1.退出===");
		startQ(s);
	}

	// 阅读应用界面
	public void Read() {
		p("				====1.建立过程===");
		p("				====2.名称由来===");
		p("				====3.指导思想===");
		p("				====4.党章======");
		p("				====5.组织机构===");
		p("				====6.历任领导人=");
		p("				====0.退出======");
		startR();
	}

	// 用户登录成功后的界面
	public void start() {
		input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			int s = 0;
			EQ.QuestionIN();
			question(s);
			break;
		case 2:
			RE.InfoIN();
			Read();
			break;
		case 3:
			Score_And_Rank();
			break;
		case 4:
			updata();
			break;
		case 5:
			line();
			login();
			break;
		case 0:
			exit();
			break;
		default:
			p("指令错误，请重新输入！");
			line();
			menu();
		}
	}

	// 答题的界面
	public void startQ(int s) {
		input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 0:
			p(information.questions.get(s).getQues());
			Scanner scanner = new Scanner(System.in);
			String ans = scanner.next();
			if (EQ.Judge(ans, s)) {
				p("恭喜你！答对了！");
				UM.addScore(s1);
			} else
				p("回答错误");
			s++;
			question(s);
			break;
		case 1:
			menu();
			break;
		default:
			p("指令错误，请重新输入！");
			line();
			startQ(s);
			break;
		}
	}

	// 阅读的界面
	public void startR() {
		input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			p(information.read.get(0).getInfo());
			returnR();
			break;
		case 2:
			p(information.read.get(1).getInfo());
			returnR();
			break;
		case 3:
			p(information.read.get(2).getInfo());
			returnR();
			break;
		case 4:
			p(information.read.get(3).getInfo());
			returnR();
			break;
		case 5:
			p(information.read.get(4).getInfo());
			returnR();
			break;
		case 6:
			p(information.read.get(5).getInfo());
			returnR();
			break;
		case 0:
			menu();
			break;
		default:
			p("指令错误，请重新输入！");
			startR();
		}
	}

	// 阅读返回界面
	public void returnR() {
		p("				====0.返回==1.退出===");
		int i = input.nextInt();
		switch (i) {
		case 0:
			Read();
			break;
		case 1:
			menu();
			break;
		default:
			p("指令错误，请重新输入！");
			returnR();
		}
	}

	// 导入账号信息
	private void Get_ID() {
		FileReader f;
		try {
			int i = 0;
			f = new FileReader("data/ID.json");
			JSONReader jsonReader = new JSONReader(f);
			jsonReader.startArray();
			while (jsonReader.hasNext()) {
				String s = jsonReader.readObject().toString();
				User temp = JSON.parseObject(s, User.class);
				information.id.add(temp);
				Srank[information.id.get(i).getScore()]++;
				i++;
			}
			jsonReader.endArray();
			jsonReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 写入账号信息到文件
	private void Out_ID(User p) {
		String ss = JSON.toJSONString(information.id);
		try {
			BufferedWriter W = new BufferedWriter(new FileWriter("data/ID.json"));
			W.write(ss);
			W.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 分数以及排名
	private void Score_And_Rank() {
		int n = maxsize;
		int m = 0;
		while (UM.Find(s1).getScore() < n) {
			m += Srank[n];
			n--;
		}
		m++;
		p("你的积分是：" + UM.Find(s1).getScore() + "你的排名是：" + m);
		menu();
	}

	// 注册
	private void add() {
		System.out.print("请输入您要注册的账户名:");
		input = new Scanner(System.in);
		String Username = input.nextLine();
		System.out.print("请设置您账户的密码:");
		String Passord = input.nextLine();
		User user = new User(Username, Passord, 0);
		if (UM.Find(Username) == null) {
			UM.add(user);
			p("注册成功");
			Out_ID(user);
			line();
			login();
		}
		p("注册失败，用户名已存在");
		line();
		login();
	}

	// 修改密码
	private void updata() {
		System.out.print("请输入更改后的密码：");
		String ss = input.next();
		UM.updata(s1, ss);
		p("修改成功！");
		menu();
	}

	// 退出
	private void exit() {
		input = new Scanner(System.in);
		p("是否确定退出？(Y/N)");
		String op = input.next();
		if (op.equalsIgnoreCase("y")) {
			p("谢谢使用,再见!");
			line();
			System.exit(1);
		}

	}

	// 登录帐号
	public int login_in() {
		p("				===============");
		p("				=====0.登录=====");
		p("				=====1.注册=====");
		p("				===============");
		Get_ID();
		int x = input.nextInt();
		if (x == 0) {
			System.out.print("请输入您的账号：");
			s1 = input.next();
			System.out.print("请输入您的密码：");
			s2 = input.next();
			User us = UM.login(s1, s2);
			if (us == null) {
				return 0;
			}
			return 1;
		} else if (x == 1) {
			return 2;
		} else
			return 3;
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.login();
	}
}