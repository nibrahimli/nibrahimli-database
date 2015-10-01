package com.nibrahimli.database.qrupEmlak.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nibrahimli.database.image.entity.Image;

@Entity
@Table(name="announcement")
public class Announcement implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private Date date;
	private String description;
	private Integer roomNumber;
	private Integer floor;
	private Boolean lift;
	private HomeType homeType;
	private Integer price;
	private Currency currency ;
	private Set<Image> images ;
	private Address address ;
	
	
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
	 * @return the title
	 */
	@Column(name="title", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci")
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date", length = 20)
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the description
	 */
	@Column(name="description", columnDefinition = "LONGTEXT CHARACTER SET utf8 COLLATE utf8_turkish_ci")
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the roomNumber
	 */
	@Column(name="room_number", nullable=true, length=10)
	public Integer getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the floor
	 */
	@Column(name="floor", nullable=true, length=10)
	public Integer getFloor() {
		return floor;
	}
	/**
	 * @param floor the floor to set
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	/**
	 * @return the lift
	 */
	@Column(name = "list", nullable = false, columnDefinition = "TINYINT default 0")
	public Boolean getLift() {
		return lift;
	}
	/**
	 * @param lift the lift to set
	 */
	public void setLift(boolean lift) {
		this.lift = lift;
	}
	/**
	 * @return the homeType
	 */
	@Column(name = "home_type", nullable = false)
	@Enumerated(EnumType.STRING)
	public HomeType getHomeType() {
		return homeType;
	}
	/**
	 * @param homeType the homeType to set
	 */
	public void setHomeType(HomeType homeType) {
		this.homeType = homeType;
	}
	/**
	 * @return the price
	 */
	@Column(name="price", nullable=true, length=10)
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * @return the currency
	 */
	@Column(name = "currency", nullable = false)
	@Enumerated(EnumType.STRING)
	public Currency getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return the images
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(
            name="announcement_image",
            joinColumns = @JoinColumn(name="announcement_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="image_id", referencedColumnName="id")
    )
	public Set<Image> getImages() {
		return images;
	}
	/**
	 * @param images the images to set
	 */
	public void setImages(Set<Image> images) {
		this.images = images;
	}
	/**
	 * @return the address
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	public enum HomeType {
		Flat ("Mənzil"),
		Villa ("Ev Həyatı") ;
		
		private String type ;
		
		public String getType() {
			return type;
		}
		
		public void setType(String type) {
			this.type = type;
		}
		
		private HomeType(String type) {
			this.setType(type);
		}
		
		public static HomeType permissiveValueOf(String type) {
			if(type == null)
				throw new IllegalArgumentException();
			for(HomeType v : values())
				if(type.equalsIgnoreCase(v.getType())) return v;
			return valueOf(type) ;
		}	
	}
	
	public enum Currency {
		Manat ("AZN"),
		Dollar ("USD"),
		Euro ("EUR");
		
		private String code ;
		
		/**
		 * @return the symbol
		 */
		public String getCode() {
			return code;
		}
		/**
		 * @param symbol the symbol to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		private Currency(String code){
			this.setCode(code);
		}
		
		public static Currency permissiveValueOf(String code) {
			if(code == null)
				throw new IllegalArgumentException();
			for(Currency v : values())
				if(code.equalsIgnoreCase(v.getCode())) return v;
			return valueOf(code) ;
		}	
		
	}
}
