package com.b301.moeum.music.dto;

import java.util.List;
import java.util.Map;

public record CreateMusicResponse(
        List<Map<String, String>> musicUrls
) {
}
