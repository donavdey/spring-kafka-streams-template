package com.kafka.streams.streams;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SampleStream {

    @Bean("streamStreamTopology")
    public KStream<String, String> startProcessing(@Qualifier("sampleStreamBuilder") StreamsBuilder builder) {
        final KStream<String, String> stream = builder.stream("input");
        //TODO: implement stream topology here
        return stream;
    }
}
