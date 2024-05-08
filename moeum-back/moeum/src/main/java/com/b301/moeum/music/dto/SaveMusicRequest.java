package com.b301.moeum.music.dto;


public record SaveMusicRequest(
        String title,
        String musicKey,
        int bpm,
        String vibe,
        String instrument,
        String artist,
        String chordList,
        String musicUrl,
        String mp3Url
) {

}
