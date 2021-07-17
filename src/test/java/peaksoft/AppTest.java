package peaksoft;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import peaksoft.config.AppConfig;
import peaksoft.model.AnimalsCage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        long time = 0;
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            if (i == 0) {
                time = bean.getTimer().getTime();
                continue;
            }
            Assert.assertEquals("Тест провален, не корректная реализация бинов.", time, bean.getTimer().getTime().longValue());
            System.out.println(time);
        }
    }
}
