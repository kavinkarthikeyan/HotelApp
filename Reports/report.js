$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "To validate the booking functionlaity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@EndToEndTesting"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To book a hotel in adactin webpage with vaild credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Retesting"
    }
  ]
});
formatter.step({
  "name": "the user enters the \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" and clicks login",
  "keyword": "When "
});
formatter.step({
  "name": "user selects the \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomtype\u003e\",\"\u003cnumberofrooms\u003e\",\"\u003cadultsperroom\u003e\"and click search",
  "keyword": "And "
});
formatter.step({
  "name": "user selects the hotel and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cAddress\u003e\",\"\u003cCCNumber\u003e\",\"\u003cCCType\u003e\",\"\u003cExpiryMonth\u003e\",\"\u003cExpiryYear\u003e\",\"\u003cCVVNumber\u003e\" and click book",
  "keyword": "And "
});
formatter.step({
  "name": "user gets the booking id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotel",
        "roomtype",
        "numberofrooms",
        "adultsperroom",
        "FirstName",
        "LastName",
        "Address",
        "CCNumber",
        "CCType",
        "ExpiryMonth",
        "ExpiryYear",
        "CVVNumber"
      ]
    },
    {
      "cells": [
        "kavin8080",
        "kavin8080",
        "Melbourne",
        "Hotel Creek",
        "Double",
        "1 - One",
        "2 - Two",
        "Kavin",
        "karthikeyan",
        "Chennai",
        "8080248110031010",
        "VISA",
        "February",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Adactin page should be launched",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingStep.the_Adactin_page_should_be_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To book a hotel in adactin webpage with vaild credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EndToEndTesting"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Retesting"
    }
  ]
});
formatter.step({
  "name": "the user enters the \"kavin8080\" and \"kavin8080\" and clicks login",
  "keyword": "When "
});
formatter.match({
  "location": "BookingStep.the_user_enters_the_and_and_clicks_login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"Melbourne\",\"Hotel Creek\",\"Double\",\"1 - One\",\"2 - Two\"and click search",
  "keyword": "And "
});
formatter.match({
  "location": "BookingStep.user_selects_the_and_click_search(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "BookingStep.user_selects_the_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Kavin\",\"karthikeyan\",\"Chennai\",\"8080248110031010\",\"VISA\",\"February\",\"2022\",\"123\" and click book",
  "keyword": "And "
});
formatter.match({
  "location": "BookingStep.user_enters_and_click_book(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the booking id",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingStep.user_gets_the_booking_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The Adactin page should be launched",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingStep.the_Adactin_page_should_be_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying the user registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndToEndTesting"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User clicking new registration",
  "keyword": "When "
});
formatter.match({
  "location": "BookingStep.user_clicking_new_registration()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027New User Regiser Here\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027GOWTHAMS-PC\u0027, ip: \u0027192.168.0.194\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.88, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\Kavin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55734}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ac6fb7b530ca85ecb07d3021c8b9a0b1\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027New User Regiser Here\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat org.stepdefinition.BookingStep.user_clicking_new_registration(BookingStep.java:94)\r\n\tat ✽.User clicking new registration(src/test/resources/Features/Login.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user created account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingStep.user_created_account_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});