import org.junit.Test;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * @file: ResourceLoaderTest.java
 * @author: caisil
 * @date: 2017/12/3
 */
public class ResourceLoaderTest {

    @Test
    public void testResolver() throws IOException {
        PathMatchingResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        System.out.println(loader.getResources("classpath:script/Lime" +
                ".groovy"));
    }
}
