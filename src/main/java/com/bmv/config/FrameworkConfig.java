package com.bmv.config;

import com.bmv.config.converters.StringToBrowserTypeConverter;
import com.bmv.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/java/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
