package com.b301.moeum.music.dto;


import org.springframework.web.multipart.MultipartFile;

public record SaveMusicRequest(
        MultipartFile imageFile,
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
