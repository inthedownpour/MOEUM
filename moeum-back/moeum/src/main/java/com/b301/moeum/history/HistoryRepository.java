package com.b301.moeum.history;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HistoryRepository extends MongoRepository<History, String> {


    List<History> findTop20ByUserUuidAndIsPublicTrueOrderByDateTimeDesc(String userUuid);

    void deleteByUserUuidAndMusicInfoId(String userUuid, Long musicInfoId);

    List<History> findAllByMusicInfoId(Long musicInfoId);


}
