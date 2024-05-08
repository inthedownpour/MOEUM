package com.b301.moeum.chord;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ChordRepository extends MongoRepository<Chord, Long> {

    Optional<List<Chord>> findAllByVibe(String vibe);

}
