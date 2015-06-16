package com.nibrahimli.database.backoffice.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="user")
public class User {
 
	private Long id;
	private String username;
	private String password;
	private boolean enabled ;
	private Set<SecurityRole> securityRoleList ;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the pseudo
	 */
	@Column(name="username", nullable=false, unique=true, columnDefinition="VARCHAR(255)")
	@Length(min=6, message="Pseudo must be at least 6 characters!")
	public String getUsername() {
		return username;
	}
	/**
	 * @param pseudo the pseudo to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the password
	 */
	@Column(name="password", unique=false, nullable=false, columnDefinition="VARCHAR(255)")
	@Length(min=8,  message="last name must be at least 8 characters!")
//	@Pattern.List({
//		@Pattern(regexp = "(?=.*[0-9])", message = "Password must contain one digit!"),
//	    @Pattern(regexp = "(?=.*[a-z])", message = "Password must contain one lowercase letter!"),
//	    @Pattern(regexp = "(?=.*[A-Z])", message = "Password must contain one uppercase letter!"),
//	    @Pattern(regexp = "(?=\\S+$)", message = "Password must contain no whitespace!")
//	})
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the enabled
	 */
	@Column(name="enabled", nullable=false, columnDefinition="tinyint(1)")
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * @return the securityRoleList
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "user_security_role", joinColumns = 
	{@JoinColumn(name = "user_id") }, inverseJoinColumns = {@JoinColumn(name = "security_role_id") })
	public Set<SecurityRole> getSecurityRoleList() {
		return securityRoleList;
	}
	/**
	 * @param securityRoleList the securityRoleList to set
	 */
	public void setSecurityRoleList(Set<SecurityRole> securityRoleList) {
		this.securityRoleList = securityRoleList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", enabled=" + enabled + ", securityRoleList="
				+ securityRoleList + "]";
	}
}
