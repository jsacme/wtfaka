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
public class WtCard extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 卡密信息
     */
    private String card;

    /**
     * 添加时间
     */
    private LocalDateTime createDate;

    /**
     * 购买时间
     */
    private LocalDateTime buyDate;

    /**
     * 购买者联系方式
     */
    private String contact;

    /**
     * 状态：0=未售,1=已售,2=锁定
     */
    private Integer status;


}
