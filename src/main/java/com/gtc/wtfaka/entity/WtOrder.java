package com.gtc.wtfaka.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class WtOrder extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    private String tradeNo;

    /**
     * 下单金额
     */
    private BigDecimal amount;

    /**
     * 支付方式ID
     */
    private Integer payId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 下单时间
     */
    private LocalDateTime createDate;

    /**
     * 下单IP
     */
    private String createIp;

    /**
     * 下单设备：0=电脑,1=安卓,2=IOS,3=IPAD
     */
    private Integer createDevice;

    /**
     * 支付时间
     */
    private LocalDateTime payDate;

    /**
     * 订单状态：0=未支付,1=已支付
     */
    private Integer status;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 卡密信息
     */
    private String commodity;

    /**
     * 查询密码
     */
    private String pass;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 优惠卷ID
     */
    private Integer voucherId;

    /**
     * 扩展信息存放字段
     */
    private String exts;

    /**
     * 发货状态
     */
    private Integer send;

    /**
     * 支付地址
     */
    @TableField("payUrl")
    private String payUrl;


}
