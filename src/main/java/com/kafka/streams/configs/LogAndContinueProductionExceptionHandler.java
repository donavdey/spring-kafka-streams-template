package com.kafka.streams.configs;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.streams.errors.LogAndContinueExceptionHandler;
import org.apache.kafka.streams.errors.ProductionExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class LogAndContinueProductionExceptionHandler implements ProductionExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(LogAndContinueExceptionHandler.class);

    @Override
    public ProductionExceptionHandlerResponse handle(ProducerRecord<byte[], byte[]> record, Exception exception) {
        log.warn("Exception caught during producing a result", exception);
        return ProductionExceptionHandlerResponse.CONTINUE;
    }

    @Override
    public void configure(Map<String, ?> configs) {
        // ignore
    }
}
