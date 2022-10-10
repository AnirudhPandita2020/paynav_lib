class PayuParamSdk{

    String key;
    String productInfo;
    String firstName;
    String email;
    String txnId;
    String amount;
    String surl = "https://www.payumoney.com/mobileapp/payumoney/success.php";
    String furl = "https://www.payumoney.com/mobileapp/payumoney/failure.php";
    String userCredentials = "user credentials";
    String offerKey = "offer key";
    String phone;
    String udf1;
    String udf2;
    String udf3;
    String udf4;
    String udf5;
    String hash;

    PayuParamSdk(this.key,this.productInfo,this.firstName,this.email,this.txnId, this.amount,this.phone,this.udf1,this.udf2,this.udf3,this.udf4,this.udf5,this.hash);


}