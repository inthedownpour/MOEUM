package com.b301.moeum.music.repository;

import com.b301.moeum.music.entity.MusicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicInfoRepository extends JpaRepository<MusicInfo, Long> {

//    Optional<MusicInfo> findByMusicInfoIdAndUserId(Long musicInfoId, String userId);
//
//    Optional<List<MusicInfo>> findAllByUserId(String userId);
}
