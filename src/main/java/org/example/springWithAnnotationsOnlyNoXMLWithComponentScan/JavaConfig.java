package org.example.springWithAnnotationsOnlyNoXMLWithComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.springWithAnnotationsOnlyNoXML")
public class JavaConfig {
}
