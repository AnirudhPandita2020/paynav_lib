class PayuParamSdk {
  String? key;
  String? payUTxnId;
  String? amount;
  String? originalAmount;
  String? commissionAmount;
  String? productInfo;
  String? firstName;
  String? email;
  String? hashed;
  String? udf1;
  String? udf2;
  String? udf3;
  String? udf4;
  String? udf5;
  String? paymentMode;

  PayuParamSdk(
      {this.key,
      this.payUTxnId,
      this.amount,
      this.originalAmount,
      this.commissionAmount,
      this.productInfo,
      this.firstName,
      this.email,
      this.hashed,
      this.udf1,
      this.udf2,
      this.udf3,
      this.udf4,
      this.udf5,
      this.paymentMode});

  PayuParamSdk.fromJson(Map<String, dynamic> json) {
    key = json['key'];
    payUTxnId = json['payUTxnId'];
    amount = json['amount'];
    originalAmount = json['originalAmount'];
    commissionAmount = json['commissionAmount'];
    productInfo = json['productInfo'];
    firstName = json['firstName'];
    email = json['email'];
    hashed = json['hashed'];
    udf1 = json['udf1'];
    udf2 = json['udf2'];
    udf3 = json['udf3'];
    udf4 = json['udf4'];
    udf5 = json['udf5'];
    paymentMode = json['paymentMode'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['key'] = this.key;
    data['payUTxnId'] = this.payUTxnId;
    data['amount'] = this.amount;
    data['originalAmount'] = this.originalAmount;
    data['commissionAmount'] = this.commissionAmount;
    data['productInfo'] = this.productInfo;
    data['firstName'] = this.firstName;
    data['email'] = this.email;
    data['hashed'] = this.hashed;
    data['udf1'] = this.udf1;
    data['udf2'] = this.udf2;
    data['udf3'] = this.udf3;
    data['udf4'] = this.udf4;
    data['udf5'] = this.udf5;
    data['paymentMode'] = this.paymentMode;
    return data;
  }
}