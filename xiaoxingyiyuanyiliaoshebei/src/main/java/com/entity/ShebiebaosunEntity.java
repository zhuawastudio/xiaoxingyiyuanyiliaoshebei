package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 设备报损
 *
 * @author 
 * @email
 */
@TableName("shebiebaosun")
public class ShebiebaosunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShebiebaosunEntity() {

	}

	public ShebiebaosunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 设备
     */
    @ColumnInfo(comment="设备",type="int(11)")
    @TableField(value = "shebei_id")

    private Integer shebeiId;


    /**
     * 科室职员
     */
    @ColumnInfo(comment="科室职员",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报损数量
     */
    @ColumnInfo(comment="报损数量",type="int(11)")
    @TableField(value = "shebiebaosun_number")

    private Integer shebiebaosunNumber;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "shebiebaosun_text")

    private String shebiebaosunText;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "shebiebaosun_yesno_types")

    private Integer shebiebaosunYesnoTypes;


    /**
     * 申请结果
     */
    @ColumnInfo(comment="申请结果",type="longtext")
    @TableField(value = "shebiebaosun_yesno_text")

    private String shebiebaosunYesnoText;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：设备
	 */
    public Integer getShebeiId() {
        return shebeiId;
    }
    /**
	 * 设置：设备
	 */

    public void setShebeiId(Integer shebeiId) {
        this.shebeiId = shebeiId;
    }
    /**
	 * 获取：科室职员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：科室职员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报损数量
	 */
    public Integer getShebiebaosunNumber() {
        return shebiebaosunNumber;
    }
    /**
	 * 设置：报损数量
	 */

    public void setShebiebaosunNumber(Integer shebiebaosunNumber) {
        this.shebiebaosunNumber = shebiebaosunNumber;
    }
    /**
	 * 获取：备注
	 */
    public String getShebiebaosunText() {
        return shebiebaosunText;
    }
    /**
	 * 设置：备注
	 */

    public void setShebiebaosunText(String shebiebaosunText) {
        this.shebiebaosunText = shebiebaosunText;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getShebiebaosunYesnoTypes() {
        return shebiebaosunYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setShebiebaosunYesnoTypes(Integer shebiebaosunYesnoTypes) {
        this.shebiebaosunYesnoTypes = shebiebaosunYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getShebiebaosunYesnoText() {
        return shebiebaosunYesnoText;
    }
    /**
	 * 设置：申请结果
	 */

    public void setShebiebaosunYesnoText(String shebiebaosunYesnoText) {
        this.shebiebaosunYesnoText = shebiebaosunYesnoText;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shebiebaosun{" +
            ", id=" + id +
            ", shebeiId=" + shebeiId +
            ", yonghuId=" + yonghuId +
            ", shebiebaosunNumber=" + shebiebaosunNumber +
            ", shebiebaosunText=" + shebiebaosunText +
            ", shebiebaosunYesnoTypes=" + shebiebaosunYesnoTypes +
            ", shebiebaosunYesnoText=" + shebiebaosunYesnoText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
