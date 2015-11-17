package com.nibrahimli.database.aws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aws_ses")
public class AwsSES {
	
	private Long id ;
	private String smtpUsername ;
	private String smtpPassword ;
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
	 * @return the smtpUsername
	 */
	@Column(name="smtp_username", columnDefinition="VARCHAR(255)", nullable=false)
	public String getSmtpUsername() {
		return smtpUsername;
	}
	/**
	 * @param smtpUsername the smtpUsername to set
	 */
	@Column(name="smtp_password", columnDefinition="VARCHAR(255)", nullable=false)
	public void setSmtpUsername(String smtpUsername) {
		this.smtpUsername = smtpUsername;
	}
	/**
	 * @return the smtpPassword
	 */
	public String getSmtpPassword() {
		return smtpPassword;
	}
	/**
	 * @param smtpPassword the smtpPassword to set
	 */
	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}	
}
