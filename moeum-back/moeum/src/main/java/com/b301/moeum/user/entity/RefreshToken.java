package com.b301.moeum.user.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@Getter
@RedisHash
public class RefreshToken {

    @Id
    private String uuid;
    private final String refreshToken;

    public RefreshToken(UUID uuid, String refreshToken) {
        this.uuid = uuid.toString();
        this.refreshToken = refreshToken;
    }
}
