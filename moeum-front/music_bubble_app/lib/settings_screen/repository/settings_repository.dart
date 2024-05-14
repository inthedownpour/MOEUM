import 'package:dio/dio.dart';
import 'package:music_bubble_app/settings_screen/model/mypage_model.dart';
import 'package:retrofit/retrofit.dart';

part 'settings_repository.g.dart';

@RestApi(baseUrl: 'https://k10b301.p.ssafy.io/api/v1')
abstract class SettingsRepository {
  factory SettingsRepository(Dio dio, {String baseUrl}) = _SettingsRepository;

  @GET("/user/info/{uuid}")
  Future<MyPageModel> getMyPage(@Path("uuid") String uuid);
}
