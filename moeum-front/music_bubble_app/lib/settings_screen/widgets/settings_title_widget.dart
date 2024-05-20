import 'package:flutter/material.dart';

Widget settingsTitleWidget(String title) {
  return Center(
    child: Padding(
      padding: const EdgeInsets.all(20),
      child: Text(
        title,
        style: const TextStyle(
          fontSize: 25,
          fontWeight: FontWeight.bold,
        ),
      ),
    ),
  );
}
