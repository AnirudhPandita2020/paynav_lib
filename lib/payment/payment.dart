import 'dart:convert';
import 'package:flutter/services.dart';
import 'package:paynav_lib/payment/model/payuparam_sdk.dart';
import 'package:paynav_lib/payment/payment_callback.dart';

class PayuPayment{
  static const _channel = MethodChannel("com.paynav.flutter/native");

  static Future<void> makePayment(
      PayuParamSdk payuParamSdk, PayUCallback callback) async {
    try {
      String response = await _channel.invokeMethod(
          "payment", jsonEncode(payuParamSdk).toString());
      callback.paymentSuccess(response);
    } on PlatformException catch (e) {
      switch (e.code) {
        case "1001":
          callback.onUpiError(e.message.toString());
          break;
        case "1002":
          callback.onVpaError(e.message.toString());
          break;
        case "1003":
          callback.paymentFailure(e.message.toString());
          break;
      }
    }
  }
}
