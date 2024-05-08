package com.b301.moeum.music.dto;

import com.b301.moeum.user.entity.User;

public record SaveMusicRequest(
        String title,
        int bpm,
        String musicKey,
        String genre,
        String vibe,
        String artist,
        String chordList,
        String musicUrl
) {

}
