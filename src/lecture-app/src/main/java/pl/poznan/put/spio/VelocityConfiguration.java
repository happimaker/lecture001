package pl.poznan.put.spio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

@Configuration
public class VelocityConfiguration {

	@Bean
	public VelocityConfigurer velocityConfigurer() {
		final VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
		velocityConfigurer.setResourceLoaderPath("velocity");
		final Map<String, Object> velocityPropertiesMap = new HashMap<>();
		velocityPropertiesMap.put("input.encoding", "UTF-8");
		velocityPropertiesMap.put("output.encoding", "UTF-8");
		velocityConfigurer.setVelocityPropertiesMap(velocityPropertiesMap);
		return velocityConfigurer;
	}

	@Bean
	public VelocityViewResolver viewResolver() {
		final VelocityViewResolver viewResolver = new VelocityViewResolver();
		viewResolver.setPrefix("");
		viewResolver.setSuffix(".vm");
		viewResolver.setCache(false);
		return viewResolver;
	}
}
