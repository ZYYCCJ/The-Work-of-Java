package 期末;

public class UserManage {
	public UserManage() {
		information.id.add(new User("123456", "123456", 0));
	}

	// 用户添加
	public void add(User u) {
		information.id.add(u);
	}

	// 验证登录
	public User login(String s1, String s2) {
		for (int i = 0; i < information.id.size(); i++) {
			if (information.id.get(i).getUsername().equals(s1) && information.id.get(i).getPassord().equals(s2)) {
				return information.id.get(i);
			}
		}
		return null;
	}

	// 查询用户
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

	// 更改密码
	public void updata(String s, String s2) {
		for (int i = 0; i < information.id.size(); i++) {
			if (information.id.get(i).getUsername().equals(s)) {
				information.id.get(i).setPassord(s2);
			}
		}
	}
}
