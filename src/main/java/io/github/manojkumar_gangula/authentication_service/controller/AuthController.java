package io.github.manojkumar_gangula.authentication_service.controller;

import io.github.manojkumar_gangula.authentication_service.dto.request.RegisterRequest;
import io.github.manojkumar_gangula.authentication_service.dto.response.RegisterResponse;
import io.github.manojkumar_gangula.authentication_service.dto.response.UserResponse;
import io.github.manojkumar_gangula.authentication_service.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private RegisterService registerService;

    public AuthController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest registerRequest){
        registerService.register(registerRequest);
        return ResponseEntity.ok(new RegisterResponse());
    }
}
