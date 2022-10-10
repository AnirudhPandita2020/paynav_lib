package com.paynav.social.paynav_lib.payment.model.dto

data class PayURequestDto(
    val amount: String,
    val commissionAmount: String,
    val email: String,
    val firstName: String,
    val hashed: String,
    val key: String,
    val originalAmount: String,
    val payUTxnId: String,
    val paymentMode: String,
    val productInfo: String,
    val udf1: String,
    val udf2: String,
    val udf3: String,
    val udf4: String,
    val udf5: String,
    val voucherId: String
)