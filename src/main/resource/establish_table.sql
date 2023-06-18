-- 创建user_wallet表
CREATE TABLE user_wallet
(
    user_id   varchar(32) primary key,
    user_name varchar(30)    NOT NULL,
    balance   decimal(10, 4) NOT NULL
);

-- 创建用户消费记录详情表
CREATE TABLE user_consumer_record
(
    user_id varchar(32) primary key,
    account decimal(10, 4) NOT NULL, -- 消费金额
    time    DATETIME       NOT NULL, -- 消费时间
    comment varchar(100),            -- 消费信息
    CONSTRAINT fk_user_id foreign key user_id references user_wallet(user_id)
);
