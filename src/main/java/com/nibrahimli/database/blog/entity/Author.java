package com.nibrahimli.database.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.nibrahimli.database.generic.entity.Image;

@Entity
@Table(name="author")
public class Author {
 
	private Long id;
	private String pseudo;
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String email;
	private String confirmEmail;
	private Image avatar ;
	
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
	@Column(name="pseudo", columnDefinition="VARCHAR(255)")
	@Length(min=6, message="Pseudo must be at least 6 characters!")
	public String getPseudo() {
		return pseudo;
	}
	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	/**
	 * @return the firstName
	 */
	@Column(name="first_name", columnDefinition="VARCHAR(255)")
	@Length(min=2,  message="First name must be at least 2 characters!")
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	@Column(name="last_name", columnDefinition="VARCHAR(255)")
	@Length(min=2,  message="Last name must be at least 2 characters!")
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the password
	 */
	@Column(name="password", columnDefinition="VARCHAR(255)")
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
	 * @return the confirmPassword
	 */
	@Column(name="confirm_password", columnDefinition="VARCHAR(255)")
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the email
	 */
	@Column(name="email", columnDefinition="VARCHAR(255)")
	@Pattern(regexp="^[A-Za-z0-9+_.-]+@(.+)$", message="Not valid email!")
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the confirmEmail
	 */
	@Column(name="confirm_email", columnDefinition="VARCHAR(255)")
	public String getConfirmEmail() {
		return confirmEmail;
	}
	/**
	 * @param confirmEmail the confirmEmail to set
	 */
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	/**
	 * @return the avatar
	 */
	@OneToOne
	@JoinColumn(name="avatar_id")
	public Image getAvatar() {
		return avatar;
	}
	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(Image avatar) {
		this.avatar = avatar;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Author [id=" + id + ", pseudo=" + pseudo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", password="
				+ password + ", confirmPassword=" + confirmPassword
				+ ", email=" + email + ", confirmEmail=" + confirmEmail
				+ ", avatar=" + avatar + "]";
	}
}
