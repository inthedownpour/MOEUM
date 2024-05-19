import 'package:flutter/material.dart';

Widget licenseWidget(BuildContext context) {
  return const Column(
    children: [
      Center(
        child: Padding(
          padding: EdgeInsets.all(20),
          child: Text(
            "오픈소스 라이센스",
            style: TextStyle(
              fontSize: 25,
              fontWeight: FontWeight.bold,
            ),
          ),
        ),
      ),
    ],
  );
}
