package org.eop.spring.session.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
/**
 * @author lixinjie
 * @since 2018-03-26
 */
@EnableRedisHttpSession
@Configuration
public class SessionConfig {

}
