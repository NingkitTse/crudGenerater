package com.xnj.multidatasource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
public class Test implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    private String NAME;

    private Integer AGE;

    private String COMMENT;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Integer getAGE() {
        return AGE;
    }

    public void setAGE(Integer AGE) {
        this.AGE = AGE;
    }

    public String getCOMMENT() {
        return COMMENT;
    }

    public void setCOMMENT(String COMMENT) {
        this.COMMENT = COMMENT;
    }

    @Override
    public String toString() {
        return "Test{" +
        "ID=" + ID +
        ", NAME=" + NAME +
        ", AGE=" + AGE +
        ", COMMENT=" + COMMENT +
        "}";
    }
}
