package spring5_webmvc_study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring5_webmvc_study.controller", "spring5_webmvc_study.survey"})
public class ControllerConfig {
}
