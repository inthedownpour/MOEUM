package com.b301.moeum.file;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FileRepository extends MongoRepository<File, String> {

    List<File> findAllByMappingIsFalse();

    void deleteByMp3UrlAndMidiUrl(String mp3Url, String midiUrl);
}
