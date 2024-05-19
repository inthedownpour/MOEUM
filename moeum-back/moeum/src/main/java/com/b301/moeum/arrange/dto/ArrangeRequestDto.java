package com.b301.moeum.arrange.dto;

import org.springframework.web.multipart.MultipartFile;

public record ArrangeRequestDto(String title, String musicKey, int bpm, String vibe, String instrument,
                                String artist, String chordList, String imageUrl) {
}
