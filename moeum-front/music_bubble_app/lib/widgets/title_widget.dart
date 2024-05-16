import 'package:flutter/material.dart';
import 'package:music_bubble_app/config/palette.dart';

Widget titleWidget(String title) {
  return Container(
    width: double.infinity,
    height: 80,
    decoration: const BoxDecoration(color: Palette.light),
    child: Center(
      child: Text(
        title,
        style: const TextStyle(
          fontSize: 30,
          fontWeight: FontWeight.bold,
        ),
      ),
    ),
  );
}
