package com.em.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.JdbcType;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("memory")
public class Memory {
    @TableId
    private long id;
    private long userId;
    @TableField(jdbcType = JdbcType.VARCHAR, typeHandler = AbstractJsonTypeHandler.class)
    private String content;
    private String location;
    private Date memoryDate;
    private Timestamp createTimestamp;
    private Timestamp modifyTimestamp;
}
