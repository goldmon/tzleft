package com.travelzen.controller;

import com.travelzen.etermface.common.config.ConfigUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA
 * User:杨果
 * Date:15/2/9
 * Time:下午1:05
 * <p/>
 * Description:
 */
public class ConfigTest {
    @Test
    public void testConfig() throws IOException {
        String conf =
                //SHA255
                "192.168.241.82-8980-SHA255:192.168.8.3_352_cdxg_65801,65802,65803,65804,65805,65806,65807,65808;" +

                        "192.168.241.83-8980-SHA255:192.168.8.3_352_cdxg_65811,65812,65813,65814,65815,65816,65817,65818;" +

                        "192.168.241.83-9180-SHA255:192.168.8.3_352_cdxg_65820,65810;" +

                        "192.168.241.84-8980-SHA255:192.168.8.87_352_cdxg_sdx01,sdx02,sdx03,sdx04,sdx05;" +

                        "192.168.241.84-8981-SHA255:192.168.8.87_352_cdxg_sdx06,sdx07,sdx08,sdx09,sdx10;" +

                        "192.168.241.84-8982-SHA255:192.168.8.87_352_cdxg_sdx11,sdx12,sdx13,sdx14,sdx15;" +

                        "192.168.241.84-8983-SHA255:192.168.8.4_352_cdxg_4365801,4365802,4365803,4365804,4365805,4365806,4365807;" +

                        "192.168.241.84-8984-SHA255:192.168.8.4_352_cdxg_4365808,4365809,4365810,4365811,4365812,4365813,4365814;" +

                        "192.168.241.84-8985-SHA255:192.168.8.4_352_cdxg_4365815,4365816,4365817,4365818,4365819,4365820,4365821;" +

                        "192.168.241.84-8986-SHA255:192.168.8.4_352_cdxg_4365822,4365823,4365824,4365825,4365826,4365827,4365828;" +

                        "192.168.241.84-8987-SHA255:192.168.8.3_352_cdxg_65809,65819,65821,65822,65823,65824,65825,65826;" +

                        "192.168.241.84-8988-SHA255:192.168.8.87_352_cdxg_gjx01,gjx06;" +

                        "192.168.241.84-8989-SHA255:192.168.8.87_352_cdxg_gjx02,gjx07;" +

                        "192.168.241.84-8990-SHA255:192.168.8.87_352_cdxg_gjx03,gjx08;" +

                        "192.168.241.84-8991-SHA255:192.168.8.87_352_cdxg_gjx04,gjx09;" +

                        "192.168.241.84-8992-SHA255:192.168.8.87_352_cdxg_gjx05,gjx10;" +
                        //BJS407
                        "192.168.241.82-8980-BJS407,192.168.241.84-8980-BJS407:192.168.8.3_352_cdxg_bjs407x01;" +

                        "192.168.241.84-8981-BJS407,192.168.241.84-8982-BJS407,192.168.241.84-8988-BJS407,192.168.241.84-8989-BJS407,192.168.241.84-8990-BJS407,192.168.241.84-8991-BJS407,192.168.241.84-8992-BJS407:192.168.8.87_352_cdxg_bjs40701;" +

                        "192.168.241.84-8983-BJS407,192.168.241.84-8984-BJS407,192.168.241.84-8985-BJS407,192.168.241.84-8986-BJS407:192.168.8.4_352_bjs40701;" +

                        "192.168.241.84-8987-BJS407:192.168.8.3_352_cdxg_bjs407x01;" +

                        "192.168.241.83-8980-BJS407:192.168.8.3_352_cdxg_bjs407x02;" +
                        //CAN525
                        "192.168.241.82-8980-CAN525,192.168.241.84-8980-CAN525:192.168.8.3_352_cdxg_can525x01;" +

                        "192.168.241.84-8981-CAN525,192.168.241.84-8982-CAN525,192.168.241.84-8988-CAN525,192.168.241.84-8989-CAN525,192.168.241.84-8990-CAN525,192.168.241.84-8991-CAN525,192.168.241.84-8992-CAN525:192.168.8.87_352_cdxg_can525x01;" +

                        "192.168.241.84-8983-CAN525,192.168.241.84-8984-CAN525,192.168.241.84-8985-CAN525,192.168.241.84-8986-CAN525:192.168.8.4_352_cdxg_can525x01;" +

                        "192.168.241.84-8987-CAN525:192.168.8.3_352_cdxg_can525x01;" +

                        "192.168.241.83-8980-CAN525:192.168.8.3_352_cdxg_can525x02;" +
                        //SHA836
                        "192.168.241.82-8980-SHA836,192.168.241.84-8980-SHA836:192.168.8.3_352_cdxg_sha836x01;" +

                        "192.168.241.84-8981-SHA836,192.168.241.84-8982-SHA836,192.168.241.84-8988-SHA836,192.168.241.84-8989-SHA836,192.168.241.84-8990-SHA836,192.168.241.84-8991-SHA836,192.168.241.84-8992-SHA836:192.168.8.87_352_cdxg_sha836x01;" +

                        "192.168.241.84-8983-SHA836,192.168.241.84-8984-SHA836,192.168.241.84-8985-SHA836,192.168.241.84-8986-SHA836:192.168.8.4_352_cdxg_sha836x01;" +

                        "192.168.241.84-8987-SHA836:192.168.8.3_352_cdxg_sha836x01;" +

                        "192.168.241.83-8980-SHA836:192.168.8.3_352_cdxg_sha836x02";
    }

    @Test
    public void readConfig() {
        ConfigUtil.getConfig();
        System.out.println("---");
    }
}
