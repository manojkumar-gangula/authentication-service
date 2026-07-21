package io.github.manojkumar_gangula.authentication_service.dto.response;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefreshTokenResponse {
    private String refreshToken;
    private String accessToken;
    private Instant expiresAt;
}
