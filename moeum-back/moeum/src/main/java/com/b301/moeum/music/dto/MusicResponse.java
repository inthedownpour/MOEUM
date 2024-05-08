package com.b301.moeum.music.dto;

import com.b301.moeum.global.StringListConverter;
import jakarta.persistence.Convert;

import java.util.List;

public record MusicResponse(
        int bpm,
                String musicKey,
                String genre,
                String vibe,
                String title,
                String artist,
                String musicUrl,
                String imageUrl,
                String videoUrl,
                String chordList

) {
}
