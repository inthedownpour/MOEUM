package com.b301.moeum.user.dto.request;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

public record TokenReissueRequestDto(@NotBlank(message = "UUID should not be null") String uuid,
                                     @NotBlank(message = "Token should not be null") String token) {
}
