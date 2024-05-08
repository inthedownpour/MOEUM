package com.b301.moeum.user.dto.request;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

public record LoginRequestDto(@NotBlank(message = "UUID should not be null") String uuid,
                              String email) {
}
