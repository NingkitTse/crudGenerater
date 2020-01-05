package com.xnj.multidatasource.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xnj.multidatasource.domain.BaseValue;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("META_DICT")
public class MetaDict extends BaseValue {

    private static final long serialVersionUID=1L;

    @TableField("TYPE")
    private String type;

    @TableField("KEYWORD")
    private String keyword;

    @TableField("VALUE")
    private String value;


}
