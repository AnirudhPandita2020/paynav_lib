class PayuParamSdk {
  String? amount;
  String? commissionAmount;
  String? email;
  String? firstName;
  String? hashed;
  String? key;
  String? originalAmount;
  String? payUTxnId;
  String? paymentMode;
  String? productInfo;
  String? udf1;
  String? udf2;
  String? udf3;
  String? udf4;
  String? udf5;
  String? voucherId;

  PayuParamSdk(
      {this.amount,
      this.commissionAmount,
      this.email,
      this.firstName,
      this.hashed,
      this.key,
      this.originalAmount,
      this.payUTxnId,
      this.paymentMode,
      this.productInfo,
      this.udf1,
      this.udf2,
      this.udf3,
      this.udf4,
      this.udf5,
      this.voucherId});

  PayuParamSdk.fromJson(Map<String, dynamic> json) {
    amount = json['amount'];
    commissionAmount = json['commissionAmount'];
    email = json['email'];
    firstName = json['firstName'];
    hashed = json['hashed'];
    key = json['key'];
    originalAmount = json['originalAmount'];
    payUTxnId = json['payUTxnId'];
    paymentMode = json['paymentMode'];
    productInfo = json['productInfo'];
    udf1 = json['udf1'];
    udf2 = json['udf2'];
    udf3 = json['udf3'];
    udf4 = json['udf4'];
    udf5 = json['udf5'];
    voucherId = json['voucherId'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['amount'] = this.amount;
    data['commissionAmount'] = this.commissionAmount;
    data['email'] = this.email;
    data['firstName'] = this.firstName;
    data['hashed'] = this.hashed;
    data['key'] = this.key;
    data['originalAmount'] = this.originalAmount;
    data['payUTxnId'] = this.payUTxnId;
    data['paymentMode'] = this.paymentMode;
    data['productInfo'] = this.productInfo;
    data['udf1'] = this.udf1;
    data['udf2'] = this.udf2;
    data['udf3'] = this.udf3;
    data['udf4'] = this.udf4;
    data['udf5'] = this.udf5;
    data['voucherId'] = this.voucherId;
    return data;
  }
}