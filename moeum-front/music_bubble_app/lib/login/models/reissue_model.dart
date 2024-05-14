import 'package:json_annotation/json_annotation.dart';

part 'reissue_model.g.dart';

@JsonSerializable()
class ReissueModel {
  final String accessToken;

  ReissueModel({
    required this.accessToken,
  });

  factory ReissueModel.fromJson(Map<String, dynamic> json) =>
      _$ReissueModelFromJson(json);

  Map<String, dynamic> toJson() => _$ReissueModelToJson(this);
}
