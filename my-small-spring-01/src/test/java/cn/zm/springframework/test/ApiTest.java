package cn.zm.springframework.test;


import cn.zm.springframework.BeanDefinition;
import cn.zm.springframework.BeanFactory;
import cn.zm.springframework.test.service.TelOperatorService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void queryBeanFactory() {
        //初始化bean Factory
        BeanFactory beanFactory = new BeanFactory();
        //register bean
        BeanDefinition beanDefinition = new BeanDefinition(new TelOperatorService());
        beanFactory.registerBeanDefinition("telOperatorService", beanDefinition);
        //get Bean and use it
        TelOperatorService service = (TelOperatorService) beanFactory.getBean("telOperatorService");
        service.queryTelOperatorInfo();
    }
}