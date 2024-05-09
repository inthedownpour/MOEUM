import 'package:flutter/material.dart';

class MusicPlayerProvider with ChangeNotifier {
  // TODO : 플레이 상태면 노래 나올 수 있도록 설정
  int _musicIndex = 0;
  bool _isPlaying = false;

  int get musicIndex => _musicIndex;
  bool get isPlaying => _isPlaying;

  void setMusicIndex(int musicIndex) {
    _musicIndex = musicIndex;
    notifyListeners();
  }

  void setIsPlaying(bool isPlaying) {
    _isPlaying = isPlaying;
    notifyListeners();
  }
}
