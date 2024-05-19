import 'package:flutter/material.dart';

class TabControllerProvider with ChangeNotifier {
  late TabController controller;

  void initialize(TickerProvider vsync, int length) {
    controller = TabController(length: length, vsync: vsync);
  }

  void switchTab(int index) {
    if (controller.indexIsChanging || controller.index != index) {
      controller.animateTo(index);
      notifyListeners();
    }
  }

  @override
  void dispose() {
    controller.dispose();
    super.dispose();
  }
}
