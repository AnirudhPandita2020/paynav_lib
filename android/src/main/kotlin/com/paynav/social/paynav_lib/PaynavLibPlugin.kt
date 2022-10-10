package com.paynav.social.paynav_lib

import android.app.Activity
import android.content.Context
import androidx.annotation.NonNull
import com.paynav.social.paynav_lib.native.NativeHandler

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.activity.ActivityAware
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result

/** PaynavLibPlugin */
class PaynavLibPlugin : FlutterPlugin, ActivityAware {

    private lateinit var context: Context
    private var activity: Activity? = null

    companion object {
        const val FLUTTER_CHANNEL = "com.paynav.flutter/native"
    }


    private lateinit var channel: MethodChannel

    override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        channel = MethodChannel(flutterPluginBinding.binaryMessenger, FLUTTER_CHANNEL)
        context = flutterPluginBinding.applicationContext
        channel.setMethodCallHandler(NativeHandler(context,activity!!,channel));
    }


    override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
    }

    override fun onAttachedToActivity(binding: ActivityPluginBinding) {
        activity = binding.activity
    }

    override fun onDetachedFromActivityForConfigChanges() {
        activity = null
    }

    override fun onReattachedToActivityForConfigChanges(binding: ActivityPluginBinding) {
        activity = binding.activity
    }

    override fun onDetachedFromActivity() {
        activity = null
    }
}
