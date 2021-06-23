package com.gtc.wtfaka.entity;

import java.math.BigDecimal;
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
public class WtCommodity extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品介绍
     */
    private String desc;

    /**
     * 商品单价：如果为0，则是免费
     */
    private BigDecimal price;

    /**
     * 批发状态：0=关闭,1=启用
     */
    private Integer wholesaleStatus;

    /**
     * 批发配置
     */
    private String wholesale;

    /**
     * 联系方式：0=任意,1=手机,2=邮箱,3=QQ
     */
    private Integer contact;

    /**
     * 联系方式提示文字
     */
    private String contactTips;

    /**
     * 商品状态：0=停售,1=销售中
     */
    private Integer status;

    /**
     * 商品排序
     */
    private Integer sort;

    /**
     * 优惠卷：0=关闭,1=启用
     */
    private Integer voucherStatus;

    /**
     * 扩展前台购买输入信息
     */
    private String inputExt;

    /**
     * 发卡方式切换
     */
    private Integer cardType;

    /**
     * 增加邮件通知
     */
    private Integer emailNotification;

    /**
     * 手动发货显示信息
     */
    private String deliveryMessage;


}
