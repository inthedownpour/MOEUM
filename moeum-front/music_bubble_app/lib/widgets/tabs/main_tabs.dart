import 'package:flutter/material.dart';

class TabInfo {
  final IconData icon;
  final String label;

  TabInfo({
    required this.icon,
    required this.label,
  });
}

var TABS = [
  TabInfo(icon: Icons.queue_music_rounded, label: '내 노래'),
  TabInfo(icon: Icons.piano_rounded, label: '노래 만들기'),
  TabInfo(icon: Icons.settings_rounded, label: '설정')
];
