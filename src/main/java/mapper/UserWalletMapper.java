package mapper;

import pojo.ConsumerRecord;

import java.util.List;

/**
 * @author zwj
 * @version 1.0
 * 用户钱包映射---->数据库中的user_wallet表
 */
public interface UserWalletMapper {

    /**
     * 查询用户的余额
     *
     * @param userId 用户的唯一标识符
     * @return 返回用户余额
     */
    double selectBalance(String userId);


    /**
     * 在使用词API前应查询用户余额如果 余额 > account 才调用此API
     *
     * @param account 用户消费的金额
     */
    void userConsumer(double account);

    /**
     * 调用此API进行用户退款
     *
     * @param account 用户退款的金额
     */
    void userRefund(double account);


    /**
     * 查询用户消费记录的API
     *
     * @param userId 用户的唯一标识符
     * @return 返回用户近期的消费列表
     */
    List<ConsumerRecord> SelectConsumerRecord(String userId);
}
