package com.gtc.wtfaka.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class WtDict extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 字典名称
     */
    private String name;

    /**
     * 字典编号
     */
    private String code;

    /**
     * 备注
     */
    private String remark;


}
