package com.b301.moeum.arrange.dto;

public record ArrangedSongDto(String title,
                              String artist,
                              int bpm,
                              String musicKey,
                              String instrument,
                              String imageUrl,
                              String musicUrl,
                              String mp3Url) {
}
