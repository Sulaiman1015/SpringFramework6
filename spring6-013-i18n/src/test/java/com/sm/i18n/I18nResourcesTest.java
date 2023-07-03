package com.sm.i18n;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18nResourcesTest {
    @Test
    public void testI18n(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"Paris",new Date().toString()};
        String value = ac.getMessage("page", objs, Locale.FRANCE);
        System.out.println(value);
    }

    @Test
    public void testResourceI18n(){
        ResourceBundle bundle = ResourceBundle.getBundle("messages",
                new Locale("fr", "FR")
        );
        String country = bundle.getString("country");
        String language = bundle.getString("language");
        System.out.println(country);
        System.out.println(language);
    }
}
