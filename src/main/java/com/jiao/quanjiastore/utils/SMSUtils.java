package com.jiao.quanjiastore.utils;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.sms.v20210111.SmsClient;
import com.tencentcloudapi.sms.v20210111.models.*;

/**
 * tencent短信
 * @Author: Jiao
 * @Date: 2023/3/3 13:01
 */
public class SMSUtils {

    /**
     * 发送短信
     * @param phoneNumbers 手机号
     * @param param 参数
     */
    public static void sendMessage(String phoneNumbers, String param) {

        try{

            Credential cred = new Credential("${SMS.SecretId}", "${SMS.SecretKey}");
            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("sms.tencentcloudapi.com");
            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            // 实例化要请求产品的client对象,clientProfile是可选的
            SmsClient client = new SmsClient(cred, "ap-beijing", clientProfile);
            // 实例化一个请求对象,每个接口都会对应一个request对象
            SendSmsRequest req = new SendSmsRequest();
            req.setPhoneNumberSet(new String[]{phoneNumbers});

            req.setSmsSdkAppId("${SMS.SdkAppId}");
            req.setSignName("S{SMS.SignName}");
            req.setTemplateId("S{SMS.TemplateId}");

            req.setTemplateParamSet(new String[]{param});

            // 返回的resp是一个SendSmsResponse的实例，与请求对象对应
            SendSmsResponse resp = client.SendSms(req);
            // 输出json格式的字符串回包
            System.out.println(SendSmsResponse.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
