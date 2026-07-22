package io.github.manojkumar_gangula.authentication_service.service;

import io.github.manojkumar_gangula.authentication_service.dto.request.RegisterRequest;
import io.github.manojkumar_gangula.authentication_service.entity.User;
import io.github.manojkumar_gangula.authentication_service.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegisterService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(RegisterRequest registerRequest) {
        Optional<User> resultSet = userRepository.findByMailId(registerRequest.getEmail());

        if(resultSet.isPresent()){
            throw new RuntimeException("User already exists");
        }else{
            User user = new User();
            user.setUsername(registerRequest.getUsername());
            user.setEmail(registerRequest.getEmail());
            user.setPasswordHash(passwordEncoder.encode(registerRequest.getPassword()));
            user.setRoles(null);
            user.setActive(true);
            userRepository.save(user);
        }
    }
}
