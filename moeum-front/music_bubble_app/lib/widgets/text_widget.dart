import 'package:flutter/material.dart';

Widget textWidget(String text,
    {double fontSize = 20, FontWeight fontWeight = FontWeight.bold}) {
  return Text(
    text,
    style: TextStyle(
      fontSize: fontSize,
      fontWeight: fontWeight,
    ),
  );
}
