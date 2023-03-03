package com.alipay.config;

public class AlipayConfig {
    // 商户appid
    public static String APPID = "2021000116677914";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCYJ272fRfuzLiqdkgXQB3bIRjT1bzL0qylLc4k2C/KtzQF01J9KLdaDXYYKgd4HcvLXs4iOA4rXlNyQ9b3Lxi9L1JscsuoXcJvD2424Gid8KViGCcvLJedpJySV83FLjySX8zxQ7kzEnDO1Jtr8fLQVI8v31xZSCdsWQ/MYzHdGQ+ZbdLSYMtHrjbGeWbF07epNRKBJ9JK6uUE6ACoTKRWGmLHChxtgP05TvaHuA/Y2iTDPsT1EAu918CNRI+tbC7uA/BGf16hfvMyJN671q42798Jouc1S5wq7d8B0QmqJV/01WXcHZngmO+0t2sL2Zh3h0twTSOF02E2rc1VsiyhAgMBAAECggEAKt6JbBeIw7aYnSagXzSodNIZba39+KuOCyghuc3TgVkm5jFJP4xWRKAgUuScoCI9Bjra91c13tA/0KT+jzyMytjnbzjU2sY3/xSo5/tIXp+r6TyG5cq5mSgFGVJ13oWNeWxWkO+U4afjctMCS2KrGDmK8mELYvhqayOYyOx14yY4JN4M5Zw3gqdHtYDkKbMU15woMACOdaiUoG9ejfeC07sApUQHQNc+JFEbfdehZLPxRviUXyzktsPq2HETuPbl5mHsW6tuDU9Uz/b+v/pGg01QGVljmzMqO8kJfTD2dyYjxUEedFn6YXLD4L7enkEKJcWSwK7C4w1Ki95y847ZAQKBgQDvu7xIvBRIDjdA242msgXlrrZNARJA0e8g5vfXBxDMHUonrepNzGjg/Z72Oo2kBradOC99PCnstQd0BNyg+5m4WLkaxdluZBPhsUMtCXqAJ96pNbnxteWfnqfSaD5gQPcnxuDi+H/+/kEgBJuFmDPD7UBY+wljP59rY+TFXVczEQKBgQCiemkFDV5sXUrXErdgYR7ZIvpxF/uGbw5lOyZX8ev2dMOU5Fkn1R6Aefmtb8TLVvOvUgZf6x/vmKiR51WWhMFbWapY3sY3xKu2/qUucitJ1Z3wWINWAtjGZUUvk2Wp7Bq6Sc8/q2soSq6U+vp6lfdRUcHYQ+pR56zf1S8PLepAkQKBgHdaTB8aJC7LhQ6xQBChyPXUycYEpoXG/vqugu13AxHb8zNWDrS08/Iv0phcBnCHNxuHAX2kGmtSpWdJlF5BZQK2iVGe9uVSxeMzUXJ2qZpsPxqXOP/xw2R4pKzIYWWicmpHRWc6uN7Gzr2WDaexYvREhijGsqHK5x+cGCV6lxNBAoGAJVTe4GxL77YXxgbk314xSk7BIE8UWbUWp6fJjZdmUgBOF93HpmFPWtGrzm/J1baq0vOTx2Isuk5nHO78OVNTYfveKgE1pgaoNamYpm1RCOvuGBUeSBrrV9pY5S+Gwl4fXgIrfkOSoXVXW5+3AYeHhcW1Nk2UfzEuBVfkMiaoliECgYARrWzoXRnvhj3XsAuA/UXzntzMz3IDGmvBQhLrkpj1cdp1Jhopn8VyzHnonUO0UyTIWAKZPRKRa5QnJWopyJtJAv2/aaMTqVpDjvow6uzxTMY5cCPLwLG+2YNizmEeSp4A3rJF3WwE7wuUBCFhjkARlCOsVOarkiWI5iPMP4czSQ==";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://nbcx5p.natappfree.cc/PeijieAlipayDemo/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://nbcx5p.natappfree.cc/PeijieAlipayDemo/return_url.jsp";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmCdu9n0X7sy4qnZIF0Ad2yEY09W8y9KspS3OJNgvyrc0BdNSfSi3Wg12GCoHeB3Ly17OIjgOK15TckPW9y8YvS9SbHLLqF3Cbw9uNuBonfClYhgnLyyXnaScklfNxS48kl/M8UO5MxJwztSba/Hy0FSPL99cWUgnbFkPzGMx3RkPmW3S0mDLR642xnlmxdO3qTUSgSfSSurlBOgAqEykVhpixwocbYD9OU72h7gP2Nokwz7E9RALvdfAjUSPrWwu7gPwRn9eoX7zMiTeu9auNu/fCaLnNUucKu3fAdEJqiVf9NVl3B2Z4JjvtLdrC9mYd4dLcE0jhdNhNq3NVbIsoQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
