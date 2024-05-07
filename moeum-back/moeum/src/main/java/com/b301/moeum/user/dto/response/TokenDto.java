package com.b301.moeum.user.dto.response;

import lombok.Getter;

import java.io.Serializable;

public record TokenDto(String uuid,
                       String accessToken,
                       String refreshToken) {
}
