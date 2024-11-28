package ie.atu.project_4th;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class Controller {
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        // Call UserService to register user
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody ARequest request) {
        return null;
    }
}

