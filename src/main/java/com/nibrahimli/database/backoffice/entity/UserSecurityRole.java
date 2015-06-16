package com.nibrahimli.database.backoffice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_security_role")
public class UserSecurityRole {
	
	private Long userId;
	private SecurityRole securityRole;
	/**
	 * @return the userId
	 */
	@Id
	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the securityRole
	 */
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="security_role_id",  referencedColumnName="id", nullable=false)
	public SecurityRole getSecurityRole() {
		return securityRole;
	}
	/**
	 * @param securityRole the securityRole to set
	 */
	public void setSecurityRole(SecurityRole securityRole) {
		this.securityRole = securityRole;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserSecurityRole [userId=" + userId + ", securityRole="
				+ securityRole + "]";
	}
}
