package com.jdbl.wallet.user;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequest {


	@NotBlank
	private String name;
	
	
	@Email
	 @NotBlank
	private  String email;
	
	@NotBlank
	private String  contact;  
	
	
	public  User  to()
	{
		return User.builder().email(email).contact(contact).name(name).build();
	}
	
	


	
	
}
