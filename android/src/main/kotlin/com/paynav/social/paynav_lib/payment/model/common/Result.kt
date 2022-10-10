package com.paynav.social.paynav_lib.payment.model.common

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("addedon") var addedon: String? = null,
    @SerializedName("address1") var address1: String? = null,
    @SerializedName("address2") var address2: String? = null,
    @SerializedName("amount") var amount: String? = null,
    @SerializedName("bankRefNo") var bankRefNo: String? = null,
    @SerializedName("bank_ref_num") var bankRefNum: String? = null,
    @SerializedName("bankcode") var bankcode: String? = null,
    @SerializedName("cardCategory") var cardCategory: String? = null,
    @SerializedName("cardNo") var cardNo: String? = null,
    @SerializedName("card_token") var cardToken: String? = null,
    @SerializedName("city") var city: String? = null,
    @SerializedName("country") var country: String? = null,
    @SerializedName("curl") var curl: String? = null,
    @SerializedName("discount") var discount: String? = null,
    @SerializedName("email") var email: String? = null,
    @SerializedName("error") var error: String? = null,
    @SerializedName("errorCode") var errorCode: String? = null,
    @SerializedName("errorMessage") var errorMessage: String? = null,
    @SerializedName("field0") var field0: String? = null,
    @SerializedName("field1") var field1: String? = null,
    @SerializedName("field2") var field2: String? = null,
    @SerializedName("field3") var field3: String? = null,
    @SerializedName("field4") var field4: String? = null,
    @SerializedName("field5") var field5: String? = null,
    @SerializedName("field6") var field6: String? = null,
    @SerializedName("field7") var field7: String? = null,
    @SerializedName("field8") var field8: String? = null,
    @SerializedName("field9") var field9: String? = null,
    @SerializedName("firstname") var firstname: String? = null,
    @SerializedName("furl") var furl: String? = null,
    @SerializedName("hash") var hash: String? = null,
    @SerializedName("ibiboCode") var ibiboCode: String? = null,
    @SerializedName("isSeamless") var isSeamless: String? = null,
    @SerializedName("key") var key: String? = null,
    @SerializedName("lastname") var lastname: String? = null,
    @SerializedName("mihpayid") var mihpayid: Long? = null,
    @SerializedName("mode") var mode: String? = null,
    @SerializedName("nameOnCard") var nameOnCard: String? = null,
    @SerializedName("net_amount_debit") var netAmountDebit: Int? = null,
    @SerializedName("offerFailureReason") var offerFailureReason: String? = null,
    @SerializedName("offerKey") var offerKey: String? = null,
    @SerializedName("paymentSource") var paymentSource: String? = null,
    @SerializedName("pgType") var pgType: String? = null,
    @SerializedName("phone") var phone: String? = null,
    @SerializedName("productinfo") var productinfo: String? = null,
    @SerializedName("state") var state: String? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("surl") var surl: String? = null,
    @SerializedName("transactionFees") var transactionFees: String? = null,
    @SerializedName("txnid") var txnid: String? = null,
    @SerializedName("udf1") var udf1: String? = null,
    @SerializedName("udf10") var udf10: String? = null,
    @SerializedName("udf2") var udf2: String? = null,
    @SerializedName("udf3") var udf3: String? = null,
    @SerializedName("udf4") var udf4: String? = null,
    @SerializedName("udf5") var udf5: String? = null,
    @SerializedName("udf6") var udf6: String? = null,
    @SerializedName("udf7") var udf7: String? = null,
    @SerializedName("udf8") var udf8: String? = null,
    @SerializedName("udf9") var udf9: String? = null,
    @SerializedName("unmappedstatus") var unmappedstatus: String? = null,
    @SerializedName("zipcode") var zipcode: String? = null

)