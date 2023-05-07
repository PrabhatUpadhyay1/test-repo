package com.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.AssertFalse.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "floor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Floor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	// ...
	
	@Column(name = "buildin_name")
	private String buildinName;
	
	@Column(name = "floor_no")
	private String floorNo;
	
	
	
	
////	@OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
////	java.util.List<Workspace> list;

}
