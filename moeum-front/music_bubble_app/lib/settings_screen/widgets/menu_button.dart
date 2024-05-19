import 'package:flutter/material.dart';
import 'package:music_bubble_app/config/palette.dart';

Widget menuButton(BuildContext context, Function function, String text,
    {Color color = Palette.touchableFont}) {
  return TextButton(
    onPressed: () {
      function();
    },
    child: Text(text,
        style:
            TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: color)),
  );
}
