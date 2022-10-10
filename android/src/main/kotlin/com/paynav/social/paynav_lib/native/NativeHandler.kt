package com.paynav.social.paynav_lib.native

import android.app.Activity
import android.content.Context
import com.google.gson.Gson
import com.paynav.social.paynav_lib.payment.model.PaymentSetup
import com.paynav.social.paynav_lib.payment.model.common.UpiResponseModel
import com.paynav.social.paynav_lib.payment.model.dto.PayURequestDto
import com.payu.upisdk.Upi
import com.payu.upisdk.callbacks.PayUUPICallback
import com.payu.upisdk.upi.IValidityCheck
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel

class NativeHandler(private val context:Context,private val activity:Activity,private val _channel:MethodChannel) :MethodChannel.MethodCallHandler {

    private lateinit var nativeResult:MethodChannel.Result

    override fun onMethodCall(call: MethodCall, result: MethodChannel.Result) {

        nativeResult = result
        when(call.method){
            "payment" -> {
                val data = Gson().fromJson(call.arguments.toString(),PayURequestDto::class.java)
                val startPayment = PaymentSetup(context,data).setupPaymentParameters()
                val upi = Upi.getInstance()
                upi.makePayment(callBack,activity,startPayment)
            }
        }
    }

    private var callBack: PayUUPICallback = object :PayUUPICallback(){
        override fun onPaymentFailure(payuResult: String?, merchantResponse: String?) {
            super.onPaymentFailure(payuResult, merchantResponse)
            nativeResult.error("1003","Transaction Failed",null)
        }

        override fun onPaymentSuccess(payuResult: String?, merchantResponse: String?) {
            super.onPaymentSuccess(payuResult, merchantResponse)
            val upiSuccessData = Gson().fromJson(merchantResponse, UpiResponseModel::class.java)
            nativeResult.success(Gson().toJson(upiSuccessData.result))
        }

        override fun onUpiErrorReceived(code: Int, errorMsg: String?) {
            super.onUpiErrorReceived(code, errorMsg)
            nativeResult.error("1001","Upi Error: $errorMsg", null)
        }

        override fun onVpaEntered(vpa: String?, iValidityCheck: IValidityCheck?) {
            super.onVpaEntered(vpa, iValidityCheck)
            nativeResult.error("1002","Vpa error: $vpa", null)
        }
    }

}