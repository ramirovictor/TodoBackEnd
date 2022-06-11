package com.ramiro.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Todo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateToFinish;
	private boolean finished = false;
/**
	public Todo(Integer id, String title, String description, Date dateToFinish, boolean finished) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.dateToFinish = dateToFinish;
		this.finished = finished;
	}

	public Todo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateToFinish() {
		return dateToFinish;
	}

	public void setDateToFinish(Date dateToFinish) {
		this.dateToFinish = dateToFinish;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Todo todo = (Todo) o;
		return id.equals(todo.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}**/
}
