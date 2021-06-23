package com.gtc.wtfaka.entity;

import java.math.BigDecimal;
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
public class WtVoucher extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 优惠卷
     */
    private String voucher;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 使用时间
     */
    private LocalDateTime useDate;

    /**
     * 过期时间
     */
    private LocalDateTime expireDate;

    /**
     * 抵扣金额
     */
    private BigDecimal money;

    /**
     * 状态：0=未使用,1=已使用
     */
    private Integer status;

    /**
     * 使用者
     */
    private String contact;


}
