package n68.example.ToDoWithSecurity.TodoController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import n68.example.ToDoWithSecuritydto.UserRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@PostMapping("/register")
		public ResponseEntity<Object> registerUser(@RequestBody @Valid UserRequest request) {
			return ResponseEntity.status(HttpStatus.CREATED).body(request);
		}
}
