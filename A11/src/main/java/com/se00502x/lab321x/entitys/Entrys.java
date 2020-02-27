package com.se00502x.lab321x.entitys;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entrys {
	private int id;
	private String name;
	private String image;
	private String content;
	private Date date;

	
	public Entrys() {
		super();
	}

	public Entrys(String name, String image, String content, Date date) {
		super();
		this.name = name;
		this.image = image;
		this.content = content;
		this.date = date;
	}
	
	public Entrys(int id, String name, String image, String content, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.content = content;
		this.date = date;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Entrys [id=" + id + ", name=" + name + ", image=" + image + ", content=" + content + ", date=" + date
				+ "]";
	}
	
	
	
	
}
