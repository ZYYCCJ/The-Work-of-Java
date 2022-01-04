package ��ĩ;

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

	// �������
	public void p(Object obj) {
		System.out.println(obj);
	}

	// ���=================
	public void line() {
		p("================================================================================");
	}

	// ��¼����
	public boolean login() {
		int t = login_in();
		if (t == 0) {
			System.out.println("�����˺Ż�����������������룡");
			line();
			login();
		} else if (t == 1) {
			menu();
		} else if (t == 2) {
			add();
		} else if (t == 3) {
			p("ָ��������������룡");
			line();
			login();
		}
		return false;
	}

	// ����Ӧ�ý���
	public void menu() {
		p("				===============");
		p("				====1.��Ŀ�ʴ�===");
		p("				====2.�Ķ���ʷ===");
		p("				====3.��������===");
		p("				====4.�����޸�===");
		p("				====5.�˳��˻�===");
		p("				====0.�˳�======");
		p("				===============");
		start();
	}

	// ����Ӧ�ý���
	public void question(int s) {
		p("				====0.����==1.�˳�===");
		startQ(s);
	}

	// �Ķ�Ӧ�ý���
	public void Read() {
		p("				====1.��������===");
		p("				====2.��������===");
		p("				====3.ָ��˼��===");
		p("				====4.����======");
		p("				====5.��֯����===");
		p("				====6.�����쵼��=");
		p("				====0.�˳�======");
		startR();
	}

	// �û���¼�ɹ���Ľ���
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
			p("ָ��������������룡");
			line();
			menu();
		}
	}

	// ����Ľ���
	public void startQ(int s) {
		input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 0:
			p(information.questions.get(s).getQues());
			Scanner scanner = new Scanner(System.in);
			String ans = scanner.next();
			if (EQ.Judge(ans, s)) {
				p("��ϲ�㣡����ˣ�");
				UM.addScore(s1);
			} else
				p("�ش����");
			s++;
			question(s);
			break;
		case 1:
			menu();
			break;
		default:
			p("ָ��������������룡");
			line();
			startQ(s);
			break;
		}
	}

	// �Ķ��Ľ���
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
			p("ָ��������������룡");
			startR();
		}
	}

	// �Ķ����ؽ���
	public void returnR() {
		p("				====0.����==1.�˳�===");
		int i = input.nextInt();
		switch (i) {
		case 0:
			Read();
			break;
		case 1:
			menu();
			break;
		default:
			p("ָ��������������룡");
			returnR();
		}
	}

	// �����˺���Ϣ
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

	// д���˺���Ϣ���ļ�
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

	// �����Լ�����
	private void Score_And_Rank() {
		int n = maxsize;
		int m = 0;
		while (UM.Find(s1).getScore() < n) {
			m += Srank[n];
			n--;
		}
		m++;
		p("��Ļ����ǣ�" + UM.Find(s1).getScore() + "��������ǣ�" + m);
		menu();
	}

	// ע��
	private void add() {
		System.out.print("��������Ҫע����˻���:");
		input = new Scanner(System.in);
		String Username = input.nextLine();
		System.out.print("���������˻�������:");
		String Passord = input.nextLine();
		User user = new User(Username, Passord, 0);
		if (UM.Find(Username) == null) {
			UM.add(user);
			p("ע��ɹ�");
			Out_ID(user);
			line();
			login();
		}
		p("ע��ʧ�ܣ��û����Ѵ���");
		line();
		login();
	}

	// �޸�����
	private void updata() {
		System.out.print("��������ĺ�����룺");
		String ss = input.next();
		UM.updata(s1, ss);
		p("�޸ĳɹ���");
		menu();
	}

	// �˳�
	private void exit() {
		input = new Scanner(System.in);
		p("�Ƿ�ȷ���˳���(Y/N)");
		String op = input.next();
		if (op.equalsIgnoreCase("y")) {
			p("ллʹ��,�ټ�!");
			line();
			System.exit(1);
		}

	}

	// ��¼�ʺ�
	public int login_in() {
		p("				===============");
		p("				=====0.��¼=====");
		p("				=====1.ע��=====");
		p("				===============");
		Get_ID();
		int x = input.nextInt();
		if (x == 0) {
			System.out.print("�����������˺ţ�");
			s1 = input.next();
			System.out.print("�������������룺");
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