package com.gtc.wtfaka.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gtc
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class WtDictList extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据名称
     */
    private String name;

    /**
     * 字典ID
     */
    private Integer dictId;

    /**
     * 数据值
     */
    private String val;

    /**
     * 状态:0=停用,1=启用
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer rank;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
