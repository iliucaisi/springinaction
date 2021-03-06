package com.lucas.springinaction.spittr.tiles.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackages = {"com.lucas.springinaction.spittr.tiles"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("com\\.lucas\\.springinaction\\.spittr\\" +
                    ".tiles\\.web"));
        }
    }
}
