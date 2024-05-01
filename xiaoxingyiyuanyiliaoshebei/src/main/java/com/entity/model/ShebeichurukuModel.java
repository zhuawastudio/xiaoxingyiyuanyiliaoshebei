package com.entity.model;

import com.entity.ShebeichurukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 设备出入库房
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShebeichurukuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 设备
     */
    private Integer shebeiId;


    /**
     * 科室职员
     */
    private Integer yonghuId;


    /**
     * 出入库类型
     */
    private Integer shebeichurukuTypes;


    /**
     * 出入库数量
     */
    private Integer shebeichurukuNumber;


    /**
     * 备注
     */
    private String shebeichurukuText;


    /**
     * 申请状态
     */
    private Integer shebeichurukuYesnoTypes;


    /**
     * 申请结果
     */
    private String shebeichurukuYesnoText;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：出入库类型
	 */
    public Integer getShebeichurukuTypes() {
        return shebeichurukuTypes;
    }


    /**
	 * 设置：出入库类型
	 */
    public void setShebeichurukuTypes(Integer shebeichurukuTypes) {
        this.shebeichurukuTypes = shebeichurukuTypes;
    }
    /**
	 * 获取：出入库数量
	 */
    public Integer getShebeichurukuNumber() {
        return shebeichurukuNumber;
    }


    /**
	 * 设置：出入库数量
	 */
    public void setShebeichurukuNumber(Integer shebeichurukuNumber) {
        this.shebeichurukuNumber = shebeichurukuNumber;
    }
    /**
	 * 获取：备注
	 */
    public String getShebeichurukuText() {
        return shebeichurukuText;
    }


    /**
	 * 设置：备注
	 */
    public void setShebeichurukuText(String shebeichurukuText) {
        this.shebeichurukuText = shebeichurukuText;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getShebeichurukuYesnoTypes() {
        return shebeichurukuYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setShebeichurukuYesnoTypes(Integer shebeichurukuYesnoTypes) {
        this.shebeichurukuYesnoTypes = shebeichurukuYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getShebeichurukuYesnoText() {
        return shebeichurukuYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setShebeichurukuYesnoText(String shebeichurukuYesnoText) {
        this.shebeichurukuYesnoText = shebeichurukuYesnoText;
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
