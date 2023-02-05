package com.greatlearning.entity;





import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails {
	@jakarta.persistence.Id
	private long Id;
	private String FirstName;
	private String LasttName;
	private String Course;
	private String Country;
	
	
	

}
