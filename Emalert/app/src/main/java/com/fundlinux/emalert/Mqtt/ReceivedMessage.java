package com.fundlinux.emalert.Mqtt;

import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Date;

/**
 * Created by parivera on 08/08/2017.
 */

public class ReceivedMessage {
    public ReceivedMessage(String topic, MqttMessage message) {
        this.topic = topic;
        this.message = message;
        this.timestamp = new Date();
    }

    private final String topic;
    private final MqttMessage message;
    private final Date timestamp;

    public String getTopic() {
        return topic;
    }

    public MqttMessage getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "ReceivedMessage{" +
                "topic='" + topic + '\'' +
                ", message=" + message +
                ", timestamp=" + timestamp +
                '}';
    }
}
