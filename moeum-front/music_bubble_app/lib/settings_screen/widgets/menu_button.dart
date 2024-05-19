import 'package:flutter/material.dart';
import 'package:music_bubble_app/config/palette.dart';

Widget menuButton(BuildContext context, Function function, String text,
    {Color color = Palette.black}) {
  return TextButton(
    onPressed: () {
      function();
    },
    child: Text(text,
        style: TextStyle(
            fontSize: 20, fontWeight: FontWeight.normal, color: color)),
  );
}
