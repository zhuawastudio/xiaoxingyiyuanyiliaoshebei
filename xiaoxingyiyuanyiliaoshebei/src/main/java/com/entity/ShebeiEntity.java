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
 * 设备
 *
 * @author 
 * @email
 */
@TableName("shebei")
public class ShebeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShebeiEntity() {

	}

	public ShebeiEntity(T t) {
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
     * 设备编号
     */
    @ColumnInfo(comment="设备编号",type="varchar(200)")
    @TableField(value = "shebei_uuid_number")

    private String shebeiUuidNumber;


    /**
     * 设备名称
     */
    @ColumnInfo(comment="设备名称",type="varchar(200)")
    @TableField(value = "shebei_name")

    private String shebeiName;


    /**
     * 设备类型
     */
    @ColumnInfo(comment="设备类型",type="int(11)")
    @TableField(value = "shebei_types")

    private Integer shebeiTypes;


    /**
     * 设备库存
     */
    @ColumnInfo(comment="设备库存",type="int(11)")
    @TableField(value = "shebei_kucun_number")

    private Integer shebeiKucunNumber;


    /**
     * 库房
     */
    @ColumnInfo(comment="库房",type="int(11)")
    @TableField(value = "kufang_id")

    private Integer kufangId;


    /**
     * 所在科室
     */
    @ColumnInfo(comment="所在科室",type="int(11)")
    @TableField(value = "keshi_types")

    private Integer keshiTypes;


    /**
     * 设备介绍
     */
    @ColumnInfo(comment="设备介绍",type="longtext")
    @TableField(value = "shebei_content")

    private String shebeiContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "shebei_delete")

    private Integer shebeiDelete;


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
	 * 获取：设备编号
	 */
    public String getShebeiUuidNumber() {
        return shebeiUuidNumber;
    }
    /**
	 * 设置：设备编号
	 */

    public void setShebeiUuidNumber(String shebeiUuidNumber) {
        this.shebeiUuidNumber = shebeiUuidNumber;
    }
    /**
	 * 获取：设备名称
	 */
    public String getShebeiName() {
        return shebeiName;
    }
    /**
	 * 设置：设备名称
	 */

    public void setShebeiName(String shebeiName) {
        this.shebeiName = shebeiName;
    }
    /**
	 * 获取：设备类型
	 */
    public Integer getShebeiTypes() {
        return shebeiTypes;
    }
    /**
	 * 设置：设备类型
	 */

    public void setShebeiTypes(Integer shebeiTypes) {
        this.shebeiTypes = shebeiTypes;
    }
    /**
	 * 获取：设备库存
	 */
    public Integer getShebeiKucunNumber() {
        return shebeiKucunNumber;
    }
    /**
	 * 设置：设备库存
	 */

    public void setShebeiKucunNumber(Integer shebeiKucunNumber) {
        this.shebeiKucunNumber = shebeiKucunNumber;
    }
    /**
	 * 获取：库房
	 */
    public Integer getKufangId() {
        return kufangId;
    }
    /**
	 * 设置：库房
	 */

    public void setKufangId(Integer kufangId) {
        this.kufangId = kufangId;
    }
    /**
	 * 获取：所在科室
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }
    /**
	 * 设置：所在科室
	 */

    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 获取：设备介绍
	 */
    public String getShebeiContent() {
        return shebeiContent;
    }
    /**
	 * 设置：设备介绍
	 */

    public void setShebeiContent(String shebeiContent) {
        this.shebeiContent = shebeiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShebeiDelete() {
        return shebeiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setShebeiDelete(Integer shebeiDelete) {
        this.shebeiDelete = shebeiDelete;
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
        return "Shebei{" +
            ", id=" + id +
            ", shebeiUuidNumber=" + shebeiUuidNumber +
            ", shebeiName=" + shebeiName +
            ", shebeiTypes=" + shebeiTypes +
            ", shebeiKucunNumber=" + shebeiKucunNumber +
            ", kufangId=" + kufangId +
            ", keshiTypes=" + keshiTypes +
            ", shebeiContent=" + shebeiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", shebeiDelete=" + shebeiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
