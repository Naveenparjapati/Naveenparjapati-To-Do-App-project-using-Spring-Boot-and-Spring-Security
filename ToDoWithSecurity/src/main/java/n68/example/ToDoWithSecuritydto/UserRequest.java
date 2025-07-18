package n68.example.ToDoWithSecuritydto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRequest {
	
	   @Size(min = 3, max = 15, message = "Username should be between 3~15 charecters")
		private String username;

		@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "Password should contain one uppercase, lowercase, number and special charecter")
		private String password;
		
		@Email(message = "Email should be Proper")
		private String email;
}

