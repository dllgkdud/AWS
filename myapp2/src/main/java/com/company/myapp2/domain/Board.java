package com.company.myapp2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BoardEntity {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE) - Oracle
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bno;
	
	@Column(length=100, nullable=false)
	private String title;
	
	@Column(length=1000, nullable=false)
	private String content;
	
	@Column(length=50, nullable=false)
	private String writer;
	
	public void change(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
