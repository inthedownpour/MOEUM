import 'package:flutter/material.dart';

class PageProvider with ChangeNotifier {
  int _pageIndex = 0;

  int get pageIndex => _pageIndex;

  void setPageIndex(int pageIndex) {
    _pageIndex = pageIndex;
    notifyListeners();
  }
}
