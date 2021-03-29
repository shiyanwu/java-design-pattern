package com.syw.prototype;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-18 13:04
 * @since JDK 1.8
 */
class MailTest {

    @Test
    void test() throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:" + mail);

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();

            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);

    }

}