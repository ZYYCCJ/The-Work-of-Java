package ��ĩ;

public class UserManage {
	public UserManage() {
		information.id.add(new User("123456", "123456", 0));
	}

	// �û����
	public void add(User u) {
		information.id.add(u);
	}

	// ��֤��¼
	public User login(String s1, String s2) {
		for (int i = 0; i < information.id.size(); i++) {
			if (information.id.get(i).getUsername().equals(s1) && information.id.get(i).getPassord().equals(s2)) {
				return information.id.get(i);
			}
		}
		return null;
	}

	// ��ѯ�û�
	public User Find(String s) {
		for (int i = 0; i < information.id.size(); i++) {
			if (information.id.get(i).getUsername().equals(s)) {
				return information.id.get(i);
			}
		}
		return null;
	}

	public void addScore(String s) {
		for (int i = 0; i < information.id.size(); i++) {
			if (information.id.get(i).getUsername().equals(s)) {
				int x = information.id.get(i).getScore() + 1;
				information.id.get(i).setScore(x);
			}
		}
	}

	// ��������
	public void updata(String s, String s2) {
		for (int i = 0; i < information.id.size(); i++) {
			if (information.id.get(i).getUsername().equals(s)) {
				information.id.get(i).setPassord(s2);
			}
		}
	}
}
