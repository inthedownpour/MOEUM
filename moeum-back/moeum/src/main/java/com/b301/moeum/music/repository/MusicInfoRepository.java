package com.b301.moeum.music.repository;

import com.b301.moeum.music.entity.MusicInfo;
import com.b301.moeum.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicInfoRepository extends JpaRepository<MusicInfo, Long> {

    List<MusicInfo> findAllByUserId(User userId);

    void deleteByUserIdAndMusicInfoId(User userId, Long musicInfoId);
}
