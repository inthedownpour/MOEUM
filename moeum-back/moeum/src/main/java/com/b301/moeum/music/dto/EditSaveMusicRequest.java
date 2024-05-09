package com.b301.moeum.music.dto;

import jakarta.annotation.Nullable;
import org.springframework.web.multipart.MultipartFile;

public record EditSaveMusicRequest(
        MultipartFile midiFile,
        MultipartFile mp3File,
        @Nullable
        MultipartFile imageFile,
        String title,
        String musicKey,
        int bpm,
        String vibe,
        String instrument,
        String artist,
        String chordList,
        String imageUrl

) {
}
