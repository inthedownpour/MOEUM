package com.b301.moeum.user.dto.request;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

public record RegistAndLoginRequestDto(@NotBlank(message = "UUID should not be null") String uniqueId,
                                       @NotBlank(message = "Email address should not be null") String email,
                                       String nickname,
                                       String profileImgUrl) {
}
