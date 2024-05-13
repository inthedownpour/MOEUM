package com.b301.moeum.music.dto;

public record MusicResponse(
        Long musicInfoId,
        String musicKey,
        int bpm,
        String vibe,
        String instrument,
        String title,
        String artist,
        String musicUrl,
        String imageUrl,
        String videoUrl,
        String mp3Url,
        String chordList,
        int views

) {
}
