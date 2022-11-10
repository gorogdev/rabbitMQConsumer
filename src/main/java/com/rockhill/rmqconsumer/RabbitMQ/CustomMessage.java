package com.rockhill.rmqconsumer.RabbitMQ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomMessage {

    private String symbol;
    private String price;
    private String localTime;
}