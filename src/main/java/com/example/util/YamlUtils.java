package com.example.util;

import com.google.common.base.MoreObjects;
import java.util.Map;
import java.util.Properties;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;

public class YamlUtils {

    public static Map<String,Object> getMap(String path){
        YamlMapFactoryBean yamlfac = new YamlMapFactoryBean();
        yamlfac.setResources(new ClassPathResource(path));
        return yamlfac.getObject();
    }

    public static Properties getProp(String path){
        YamlPropertiesFactoryBean yamlfac = new YamlPropertiesFactoryBean();
        yamlfac.setResources(new ClassPathResource(path));
        return yamlfac.getObject();
    }

    public static void main(String[] args) {
        System.out.println("=======================");
        Map<String,Object> map =   YamlUtils.getMap("static/json/swagger.json");
        System.out.println(map);
        System.out.println();

        Properties prop = YamlUtils.getProp("static/json/swagger.yaml");
        System.out.println(prop);
        System.out.println("=================================");

        map =   YamlUtils.getMap("static/json/test.json");
        System.out.println(map);
        System.out.println();

    }

}
