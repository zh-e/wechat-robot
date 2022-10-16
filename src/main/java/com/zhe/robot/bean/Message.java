package com.zhe.robot.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JacksonXmlRootElement(localName = "xml")
public class Message {

    @JacksonXmlProperty(localName = "ToUserName")
    @JacksonXmlCData
    private String toUserName;

    @JacksonXmlProperty(localName = "FromUserName")
    @JacksonXmlCData
    private String fromUserName;

    @JacksonXmlProperty(localName = "CreateTime")
    private Long createTime;

    @JacksonXmlProperty(localName = "MsgType")
    @JacksonXmlCData
    private String msgType;

    @JacksonXmlProperty(localName = "Content")
    @JacksonXmlCData
    private String content;

    @JacksonXmlProperty(localName = "MsgId")
    @JacksonXmlCData
    private String msgId;

    @JacksonXmlProperty(localName = "MsgDataId")
    @JacksonXmlCData
    private String msgDataId;

    @JacksonXmlProperty(localName = "Idx")
    @JacksonXmlCData
    private String idx;

//<xml>
//  <ToUserName><![CDATA[toUser]]></ToUserName>
//  <FromUserName><![CDATA[fromUser]]></FromUserName>
//  <CreateTime>1348831860</CreateTime>
//  <MsgType><![CDATA[text]]></MsgType>
//  <Content><![CDATA[this is a test]]></Content>
//  <>1234567890123456</MsgId>
//  <>xxxx</MsgDataId>
//  <>xxxx</Idx>
//</xml>


}
