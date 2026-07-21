package io.github.manojkumar_gangula.authentication_service.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterResponse {
    private String username;
    private String email;
    private String message;
}
