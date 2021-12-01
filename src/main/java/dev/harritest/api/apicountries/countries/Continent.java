package dev.harritest.api.apicountries.countries;




import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Continent {

		//@Id
		//@GeneratedValue (strategy = GenerationType.IDENTITY)
		//private Integer id;
		
		@Id
		@Size(min=2, message="Code should have atleast 2 characters")
		private String code;
		private String name;
		
		
		@OneToMany(mappedBy="continent")
		@JsonIgnore
		private List<Country> countries;

		public Continent() {
			
		}
		
		public Continent(@Size(min = 2, message = "Code should have atleast 2 characters") String code, String name) {
			super();
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}
 
		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

//		public Integer getId() {
//			return id;
//		}
//
//		public void setId(Integer id) {
//			this.id = id;
//		}
//
		public List<Country> getCountries() {
			return countries;
		}

		public void setCountries(List<Country> countries) {
			this.countries = countries;
		}


		
		
}
