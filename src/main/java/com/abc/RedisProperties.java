package com.abc;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alhagie Bai Cham
 * @date 12/13/22
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "jedis")
public class RedisProperties {
    private String hostName;
    private int port;
}
