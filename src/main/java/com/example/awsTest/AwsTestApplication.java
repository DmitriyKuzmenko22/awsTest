package com.example.awsTest;

import com.example.awsTest.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import ch.qos.logback.access.tomcat.LogbackValve;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;

@SpringBootApplication
public class AwsTestApplication {

//	@Value("${bp.access.secure.only:true}")
//	private boolean accessSecureOnly;
//
//	@Value("${server.accesslog.enabled:false}")
//	private boolean accessLogEnabled;
//
//	@Value("${server.http.port}")
//	private Integer httpPort;
//
//	@Value("${server.port}")
//	private Integer httpsPort;
//
//	@Bean
//	public ServletWebServerFactory servletContainer() {
//		TomcatServletWebServerFactory tomcat = null;
//
//		if (accessSecureOnly) {
//			tomcat = new TomcatServletWebServerFactory() {
//				@Override
//				protected void postProcessContext(Context context) {
//					SecurityConstraint securityConstraint = new SecurityConstraint();
//					securityConstraint.setUserConstraint(String.valueOf(httpsPort));
//					SecurityCollection collection = new SecurityCollection();
//					collection.addPattern("/*");
//					securityConstraint.addCollection(collection);
//					context.addConstraint(securityConstraint);
//				}
//			};
//		} else {
//			tomcat = new TomcatServletWebServerFactory();
//		}
//
//		if (httpPort != null) {
//			tomcat.addAdditionalTomcatConnectors(createAdditionalConnector());
//		}
//
//		if (accessLogEnabled) {
//			LogbackValve logbackValve = new LogbackValve();
//			logbackValve.setFilename(Config.ACCESS_LOG_CONFIG);
//			tomcat.addContextValves(logbackValve);
//		}
//
//		return tomcat;
//	}
//
//	private Connector createAdditionalConnector() {
//		Connector connector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
//		connector.setPort(httpPort);
//		if (accessSecureOnly) {
//			connector.setRedirectPort(httpsPort);
//		}
//		return connector;
//	}

	public static void main(String[] args) {
		SpringApplication.run(AwsTestApplication.class, args);
	}

}
