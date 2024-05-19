import 'package:flutter/material.dart';

class MusicSwipeProvider with ChangeNotifier {
  int _musicIndex = 1;

  int get musicIndex => _musicIndex;

  void setMusicIndex(int index) {
    _musicIndex = index;
    notifyListeners();
  }
}
