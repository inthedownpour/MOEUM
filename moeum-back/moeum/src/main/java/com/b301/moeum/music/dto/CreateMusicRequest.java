package com.b301.moeum.music.dto;

public record  CreateMusicRequest(
        int bpm,
        String musicKey,
        String vibe,
        String instrument,
        String chordList
) {
}
