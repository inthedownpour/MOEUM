package com.b301.moeum.music.repository;

import com.b301.moeum.music.entity.MusicInfo;
import com.b301.moeum.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MusicInfoRepository extends JpaRepository<MusicInfo, Long> {

    List<MusicInfo> findAllByUserId(User userId);

    Optional<MusicInfo> findByUserIdAndMusicInfoId(User userId, Long musicInfoId);
}
