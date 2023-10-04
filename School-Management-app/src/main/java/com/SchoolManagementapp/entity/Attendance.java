package com.SchoolManagementapp.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attendance_details")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String studentName;
	private boolean attendance;
	private LocalDateTime date_;
	private String createdBy;
	@CreationTimestamp
	private Timestamp createdAt;
	@UpdateTimestamp
	private Timestamp updatedAt;
}
