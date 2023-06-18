package pojo;

import java.time.LocalDate;

/**
 * @author zwj
 * @version 1.0
 * 存储一个用户消费详情的类
 */
public class ConsumerRecord {
    //用户Id
    private final String userId;
    //消费金额
    private final double account;
    //消费的时间
    private final LocalDate time;
    //消费的具体描述
    private final String comment;

    public ConsumerRecord(String userId, double account, LocalDate time, String comment) {
        this.userId = userId;
        this.account = account;
        this.time = time;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ConsumerRecord{" +
                "userId='" + userId + '\'' +
                ", account=" + account +
                ", time=" + time +
                ", comment='" + comment + '\'' +
                '}';
    }
}
