package com.paynav.social.paynav_lib.payment.model

import android.content.Context
import com.payu.upisdk.bean.UpiConfig
import com.payu.upisdk.generatepostdata.PaymentParamsUpiSdk
import com.payu.upisdk.generatepostdata.PostDataGenerate
import com.payu.upisdk.util.UpiConstant
import com.paynav.social.paynav_lib.payment.model.dto.PayURequestDto

class PaymentSetup(private val context: Context, private val paymentRequestDto:PayURequestDto) {

    fun setupPaymentParameters(): UpiConfig {
        val mPaymentParamsUpiSdk = PaymentParamsUpiSdk()
        mPaymentParamsUpiSdk.key = paymentRequestDto.key
        mPaymentParamsUpiSdk.productInfo = paymentRequestDto.productInfo
        mPaymentParamsUpiSdk.firstName = paymentRequestDto.firstName
        mPaymentParamsUpiSdk.email = paymentRequestDto.email
        mPaymentParamsUpiSdk.txnId = paymentRequestDto.payUTxnId
        mPaymentParamsUpiSdk.surl = "https://www.payumoney.com/mobileapp/payumoney/success.php"
        mPaymentParamsUpiSdk.furl = "https://www.payumoney.com/mobileapp/payumoney/failure.php"
        mPaymentParamsUpiSdk.udf1 = paymentRequestDto.udf1
        mPaymentParamsUpiSdk.udf2 = paymentRequestDto.udf2
        mPaymentParamsUpiSdk.udf3 = paymentRequestDto.udf3
        mPaymentParamsUpiSdk.udf4 = paymentRequestDto.udf4
        mPaymentParamsUpiSdk.udf5 = paymentRequestDto.udf5
        mPaymentParamsUpiSdk.userCredentials = "user credentials"
        mPaymentParamsUpiSdk.offerKey = "offer key"
        mPaymentParamsUpiSdk.phone = ""
        mPaymentParamsUpiSdk.hash = paymentRequestDto.hashed
        val postDataFromUpiSdk = PostDataGenerate.PostDataBuilder(context)
            .setPaymentMode(UpiConstant.UPI_INTENT)
            .setPaymentParamUpiSdk(mPaymentParamsUpiSdk).build().toString()
        val upiConfig = UpiConfig()
        upiConfig.merchantKey =  paymentRequestDto.key
        upiConfig.payuPostData = postDataFromUpiSdk
        upiConfig.disableIntentSeamlessFailure = UpiConfig.TRUE / UpiConfig.FALSE
        upiConfig.setGmsProviderUpdatedStatus(UpiConfig.TRUE / UpiConfig.DISABLE)
        return upiConfig
    }

}
