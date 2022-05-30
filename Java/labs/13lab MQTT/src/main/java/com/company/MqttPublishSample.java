package com.company;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Scanner;

public class MqttPublishSample {
    public static String res = "";

    public static class SimpleMqttCallBack implements MqttCallback {

        public void connectionLost(Throwable throwable) {
            System.out.println("Connection to MQTT broker lost!");
        }

        public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
            res = new String(mqttMessage.getPayload());
            System.out.println("Message added to variable res" );
        }

        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
            // not used in this example
        }
    }
    public static int getLen(String str){
        int len = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                len += 1;
            }
        }
        return len;
    }
    public static String[] parse(String str){
        String val = "";
        int cnt = 0;
        int len = getLen(str);
        String[] res = new String[len];
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ' || i == str.length()){
                res[cnt] = val;
                cnt += 1;
                val = "";
            } else {
                val += Character.toString(str.charAt(i));
            }
            //System.out.println(val);
        }
        res[res.length-1] = val;
        return res;
    }

    public static void main(String[] args) throws MqttException {
        Scanner scanner = new Scanner(System.in);
        String topic        = "MQTT Examples";
        String content      = scanner.nextLine();
        int qos             = 2;
        String broker       = "tcp://mqtt.eclipseprojects.io:1883";
        String clientId     = "JavaSample";
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");

            System.out.println("Publishing message: "+content);
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            System.out.println("Message published");

            MqttClient client=new MqttClient(broker, MqttClient.generateClientId());
            SimpleMqttCallBack call = new SimpleMqttCallBack();
            client.setCallback( call);
            client.connect();
            client.subscribe(topic);
            //client.getTopic(topic);
            call.messageArrived(topic, message);

            System.out.println("Get message from broker: " + res);

            sampleClient.disconnect();
            System.out.println("Disconnected");

        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] parsedString = parse(res);
        /*for (int i = 0; i < parsedString.length; i++){
            System.out.println(parsedString[i]);
        }*/

        int a = Integer.parseInt(parsedString[0]);
        int b = Integer.parseInt(parsedString[1]);
        int c = Integer.parseInt(parsedString[2]);

        int D = b*b - 4*a*c;

        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");

            System.out.println("Publishing message...");

            if (D < 0){
                MqttMessage message = new MqttMessage("No solutions".getBytes());
                message.setQos(qos);
                sampleClient.publish(topic, message);
                System.out.println("Message published");
                MqttClient client=new MqttClient(broker, MqttClient.generateClientId());
                SimpleMqttCallBack call = new SimpleMqttCallBack();
                client.setCallback(call);
                client.connect();
                client.subscribe(topic);
                //client.getTopic(topic);
                call.messageArrived(topic, message);
                System.out.println("Get message from broker: " + message);
            }
            if (D == 0){
                MqttMessage message = new MqttMessage((Integer.toString((-b)/2*a)).getBytes());
                message.setQos(qos);
                sampleClient.publish(topic, message);
                System.out.println("Message published");
                MqttClient client=new MqttClient(broker, MqttClient.generateClientId());
                SimpleMqttCallBack call = new SimpleMqttCallBack();
                client.setCallback(call);
                client.connect();
                client.subscribe(topic);
                //client.getTopic(topic);
                call.messageArrived(topic, message);
                System.out.println("Get message from broker: " + message);
            }
            if (D > 0){
                double newD = D;
                double newA = a;
                double newB = b;
                MqttMessage message = new MqttMessage(String.valueOf(((-newB)+Math.sqrt(newD))/(2*newA)).getBytes());
                message.setQos(qos);
                MqttMessage message2 = new MqttMessage(String.valueOf(((-newB)-Math.sqrt(newD))/(2*newA)).getBytes());
                message2.setQos(qos);
                sampleClient.publish(topic, message);
                sampleClient.publish(topic, message2);
                System.out.println("Message published");
                MqttClient client=new MqttClient(broker, MqttClient.generateClientId());
                SimpleMqttCallBack call = new SimpleMqttCallBack();
                client.setCallback(call);
                client.connect();
                client.subscribe(topic);
                //client.getTopic(topic);
                call.messageArrived(topic, message);
                call.messageArrived(topic, message2);
                System.out.println("Get message from broker: " + message);
                System.out.println("Get message from broker: " + message2);
            }

            /*MqttClient client=new MqttClient(broker, MqttClient.generateClientId());
            SimpleMqttCallBack call = new SimpleMqttCallBack();
            client.setCallback(call);
            client.connect();
            client.subscribe(topic);
            //client.getTopic(topic);
            call.messageArrived(topic, message);*/

            sampleClient.disconnect();
            System.out.println("Disconnected");

        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.exit(1);
    }
}