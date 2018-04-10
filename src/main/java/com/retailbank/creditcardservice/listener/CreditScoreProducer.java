package com.retailbank.creditcardservice.listener;

import com.retailbank.creditcardservice.gateway.CreditCheckRequest;
import com.retailbank.creditcardservice.gateway.CreditCheckResponse;
import com.retailbank.creditcardservice.repository.CreditScoreRepository;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class CreditScoreProducer {

    private final Source source;

    public CreditScoreProducer(Source source) {
        this.source = source;
    }

    public void requestScore(CreditCheckRequest creditCheckRequest) {
        source.output().send(MessageBuilder.withPayload(creditCheckRequest).build());
    }
}
