# NotificationApi

All URIs are relative to *http://localhost/mt-services/notification/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailTrackingDetails**](NotificationApi.md#getEmailTrackingDetails) | **POST** /getEmailTrackingDetails | Get the details of an email tracked
[**sendEmail**](NotificationApi.md#sendEmail) | **POST** /sendEmail | Send Email and track the email details.
[**sendPush**](NotificationApi.md#sendPush) | **POST** /sendPush | Send Push
[**sendSms**](NotificationApi.md#sendSms) | **POST** /sendSms | Send Sms


<a name="getEmailTrackingDetails"></a>
# **getEmailTrackingDetails**
> GetEmailTrackingDetailsResponse getEmailTrackingDetails(getEmailTrackingDetailsRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID)

Get the details of an email tracked

Get the details of an email tracked inquiring by date range (required) and at least one of other request fields (fromAddress, toAddress,ccAddress, templateId). The result are paginated.

### Example
```java
// Import classes:
//import it.nexi.control_relation.batch.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
GetEmailTrackingDetailsRequest getEmailTrackingDetailsRequest = new GetEmailTrackingDetailsRequest(); // GetEmailTrackingDetailsRequest | 
String MT_APPLICATION = "MT_APPLICATION_example"; // String | technical code of the application calling the service.   'Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]'
String MT_USER = "MT_USER_example"; // String | user identifier of the request (username , userid , ...)
String MT_CHANNEL = "MT_CHANNEL_example"; // String | channel code of the request - [WEB, MOB] 
String MT_COMPANY_GROUP = "MT_COMPANY_GROUP_example"; // String | Company Group identification code. Possible values - [NEXI]
String MT_COMPANY = "MT_COMPANY_example"; // String | Company code. Possible values - [NEXI]
String MT_REQUEST_ID = "MT_REQUEST_ID_example"; // String | Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b]
String MT_PARTNER = "MT_PARTNER_example"; // String | Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI]
String MT_SESSION_ID = "MT_SESSION_ID_example"; // String | Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9]
try {
    GetEmailTrackingDetailsResponse result = apiInstance.getEmailTrackingDetails(getEmailTrackingDetailsRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getEmailTrackingDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getEmailTrackingDetailsRequest** | [**GetEmailTrackingDetailsRequest**](GetEmailTrackingDetailsRequest.md)|  |
 **MT_APPLICATION** | **String**| technical code of the application calling the service.   &#39;Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]&#39; |
 **MT_USER** | **String**| user identifier of the request (username , userid , ...) |
 **MT_CHANNEL** | **String**| channel code of the request - [WEB, MOB]  |
 **MT_COMPANY_GROUP** | **String**| Company Group identification code. Possible values - [NEXI] |
 **MT_COMPANY** | **String**| Company code. Possible values - [NEXI] |
 **MT_REQUEST_ID** | **String**| Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b] |
 **MT_PARTNER** | **String**| Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI] |
 **MT_SESSION_ID** | **String**| Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9] |

### Return type

[**GetEmailTrackingDetailsResponse**](GetEmailTrackingDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmail"></a>
# **sendEmail**
> SendEmailResponse sendEmail(sendEmailRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID)

Send Email and track the email details.

Send Email and track the email details (if flagTrack is true). If the templateId is set, the email field will be retrieved by email template (previously agreed).

### Example
```java
// Import classes:
//import it.nexi.control_relation.batch.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
SendEmailRequest sendEmailRequest = new SendEmailRequest(); // SendEmailRequest | 
String MT_APPLICATION = "MT_APPLICATION_example"; // String | technical code of the application calling the service.   'Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]'
String MT_USER = "MT_USER_example"; // String | user identifier of the request (username , userid , ...)
String MT_CHANNEL = "MT_CHANNEL_example"; // String | channel code of the request - [WEB, MOB] 
String MT_COMPANY_GROUP = "MT_COMPANY_GROUP_example"; // String | Company Group identification code. Possible values - [NEXI]
String MT_COMPANY = "MT_COMPANY_example"; // String | Company code. Possible values - [NEXI]
String MT_REQUEST_ID = "MT_REQUEST_ID_example"; // String | Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b]
String MT_PARTNER = "MT_PARTNER_example"; // String | Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI]
String MT_SESSION_ID = "MT_SESSION_ID_example"; // String | Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9]
try {
    SendEmailResponse result = apiInstance.sendEmail(sendEmailRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendEmailRequest** | [**SendEmailRequest**](SendEmailRequest.md)|  |
 **MT_APPLICATION** | **String**| technical code of the application calling the service.   &#39;Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]&#39; |
 **MT_USER** | **String**| user identifier of the request (username , userid , ...) |
 **MT_CHANNEL** | **String**| channel code of the request - [WEB, MOB]  |
 **MT_COMPANY_GROUP** | **String**| Company Group identification code. Possible values - [NEXI] |
 **MT_COMPANY** | **String**| Company code. Possible values - [NEXI] |
 **MT_REQUEST_ID** | **String**| Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b] |
 **MT_PARTNER** | **String**| Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI] |
 **MT_SESSION_ID** | **String**| Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9] |

### Return type

[**SendEmailResponse**](SendEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendPush"></a>
# **sendPush**
> SendPushResponse sendPush(sendPushRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID)

Send Push

Send push; the push text will be retrieved by push template (previously agreed).

### Example
```java
// Import classes:
//import it.nexi.control_relation.batch.ApiClient;
//import it.nexi.control_relation.batch.ApiException;
//import it.nexi.control_relation.batch.Configuration;
//import it.nexi.control_relation.batch.auth.*;
//import io.swagger.client.api.NotificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

NotificationApi apiInstance = new NotificationApi();
SendPushRequest sendPushRequest = new SendPushRequest(); // SendPushRequest | 
String MT_APPLICATION = "MT_APPLICATION_example"; // String | technical code of the application calling the service.   'Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]'
String MT_USER = "MT_USER_example"; // String | user identifier of the request (username , userid , ...)
String MT_CHANNEL = "MT_CHANNEL_example"; // String | channel code of the request - [WEB, MOB] 
String MT_COMPANY_GROUP = "MT_COMPANY_GROUP_example"; // String | Company Group identification code. Possible values - [NEXI]
String MT_COMPANY = "MT_COMPANY_example"; // String | Company code. Possible values - [NEXI]
String MT_REQUEST_ID = "MT_REQUEST_ID_example"; // String | Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b]
String MT_PARTNER = "MT_PARTNER_example"; // String | Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI]
String MT_SESSION_ID = "MT_SESSION_ID_example"; // String | Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9]
try {
    SendPushResponse result = apiInstance.sendPush(sendPushRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#sendPush");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendPushRequest** | [**SendPushRequest**](SendPushRequest.md)|  |
 **MT_APPLICATION** | **String**| technical code of the application calling the service.   &#39;Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]&#39; |
 **MT_USER** | **String**| user identifier of the request (username , userid , ...) |
 **MT_CHANNEL** | **String**| channel code of the request - [WEB, MOB]  |
 **MT_COMPANY_GROUP** | **String**| Company Group identification code. Possible values - [NEXI] |
 **MT_COMPANY** | **String**| Company code. Possible values - [NEXI] |
 **MT_REQUEST_ID** | **String**| Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b] |
 **MT_PARTNER** | **String**| Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI] |
 **MT_SESSION_ID** | **String**| Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9] |

### Return type

[**SendPushResponse**](SendPushResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendSms"></a>
# **sendSms**
> SendSmsResponse sendSms(sendSmsRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID)

Send Sms

Send sms; the sms text will be retrieved by sms template (previously agreed).

### Example
```java
// Import classes:
//import it.nexi.control_relation.batch.ApiException;
//import io.swagger.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
SendSmsRequest sendSmsRequest = new SendSmsRequest(); // SendSmsRequest | 
String MT_APPLICATION = "MT_APPLICATION_example"; // String | technical code of the application calling the service.   'Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]'
String MT_USER = "MT_USER_example"; // String | user identifier of the request (username , userid , ...)
String MT_CHANNEL = "MT_CHANNEL_example"; // String | channel code of the request - [WEB, MOB] 
String MT_COMPANY_GROUP = "MT_COMPANY_GROUP_example"; // String | Company Group identification code. Possible values - [NEXI]
String MT_COMPANY = "MT_COMPANY_example"; // String | Company code. Possible values - [NEXI]
String MT_REQUEST_ID = "MT_REQUEST_ID_example"; // String | Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b]
String MT_PARTNER = "MT_PARTNER_example"; // String | Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI]
String MT_SESSION_ID = "MT_SESSION_ID_example"; // String | Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9]
try {
    SendSmsResponse result = apiInstance.sendSms(sendSmsRequest, MT_APPLICATION, MT_USER, MT_CHANNEL, MT_COMPANY_GROUP, MT_COMPANY, MT_REQUEST_ID, MT_PARTNER, MT_SESSION_ID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#sendSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendSmsRequest** | [**SendSmsRequest**](SendSmsRequest.md)|  |
 **MT_APPLICATION** | **String**| technical code of the application calling the service.   &#39;Possible values - [Card Holder Portal (CH), On Boarding Issuing (OBI)]&#39; |
 **MT_USER** | **String**| user identifier of the request (username , userid , ...) |
 **MT_CHANNEL** | **String**| channel code of the request - [WEB, MOB]  |
 **MT_COMPANY_GROUP** | **String**| Company Group identification code. Possible values - [NEXI] |
 **MT_COMPANY** | **String**| Company code. Possible values - [NEXI] |
 **MT_REQUEST_ID** | **String**| Random unique identification code of the request set by the client.  Example UUID [8119c0ce-17f2-11e8-accf-0ed5f89f718b] |
 **MT_PARTNER** | **String**| Partner belonging to the company.  It describe a subset of NEXI customer related to the specified partner.  Possible values - [NEXI] |
 **MT_SESSION_ID** | **String**| Random unique identification code identifying a single session of the client. Example JSESSIONID [b272023f-05ca-44cb-96cd-6d72c72d03f9] |

### Return type

[**SendSmsResponse**](SendSmsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

