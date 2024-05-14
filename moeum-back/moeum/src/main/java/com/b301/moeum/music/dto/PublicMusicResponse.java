package com.b301.moeum.music.dto;

import java.util.List;

public record PublicMusicResponse(
        List<MusicResponse> topViewList,
        List<MusicResponse> randomList
) {
}
