package springbook.user.domain;

/**
 * 사용자 정보 저장용 자바빈 User 클래스 
 * @author kt.kim
 *
 */
public class User {
	
	private String id;
	private String name;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
