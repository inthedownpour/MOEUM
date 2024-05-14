import 'package:json_annotation/json_annotation.dart';

part 'mypage_model.g.dart';

@JsonSerializable()
class MyPageModel {
  final String email;
  final String nickname;
  final String profileImgUrl;

  MyPageModel({
    required this.email,
    required this.nickname,
    required this.profileImgUrl,
  });

  factory MyPageModel.fromJson(Map<String, dynamic> json) =>
      _$MyPageModelFromJson(json);

  Map<String, dynamic> toJson() => _$MyPageModelToJson(this);
}
