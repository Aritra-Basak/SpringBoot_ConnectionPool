/**
 * 
 */
package com.demo.ConnectionPool.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * @author Aritra
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Builder
@ToString
@Entity
@Table(name="JWT_User_Details")
public class User {
	 	@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    @Column(name="user_id")
	    @JsonProperty(value="ID")
	    int userId;
	    
	    @Column(name="user_name")
	    @JsonProperty(value="Name")
	    String name;
	    
	    @Column(name="user_email_id")
	    @JsonProperty(value="E-mail")
	    String email;
	    
	    
	    @Column(name="user_role")
	    @JsonProperty(value="Role")
	    String role;
	    
	    @JsonIgnore
	    @Column(name="is_active")
	    int isActive;
	    
	    @JsonProperty(value="User_is_Active")
	    String isActiveValue;
	    

}
