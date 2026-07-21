package io.github.manojkumar_gangula.authentication_service.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class LoginResponse {
    private String accessToken;
    private String refreshToken;
    private Instant expiresAt;
}
