package io.choerodon.gateway

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaTemplate
import spock.mock.DetachedMockFactory


/**
 * @author superlee
 */

@TestConfiguration
class IntegrationTestConfiguration {

    private final detachedMockFactory = new DetachedMockFactory()

    @Bean
    KafkaTemplate<byte[], byte[]> kafkaTemplate() {
        detachedMockFactory.Mock(KafkaTemplate)
    }

}