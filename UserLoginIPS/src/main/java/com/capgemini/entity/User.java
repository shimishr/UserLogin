package com.capgemini.entity;
import javax.persistence.Entity;
import javax.persistence.Column;

/*import javax.persistence.Embeddable;*/
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="demo_user_register")
@Entity
public class User {

	@Id
	private long userId;
	
	@Column(name="username")
	private String userName;
	
	@Column
	private String password;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
}
