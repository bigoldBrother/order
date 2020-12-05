package cn.edu.xmu.freight.model.po;

import java.time.LocalDateTime;

public class FreightModelPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.shop_id
     *
     * @mbg.generated
     */
    private Long shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.default_model
     *
     * @mbg.generated
     */
    private String defaultModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.unit
     *
     * @mbg.generated
     */
    private Integer unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.gmt_create
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freight_model.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.id
     *
     * @return the value of freight_model.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.id
     *
     * @param id the value for freight_model.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.shop_id
     *
     * @return the value of freight_model.shop_id
     *
     * @mbg.generated
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.shop_id
     *
     * @param shopId the value for freight_model.shop_id
     *
     * @mbg.generated
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.name
     *
     * @return the value of freight_model.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.name
     *
     * @param name the value for freight_model.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.default_model
     *
     * @return the value of freight_model.default_model
     *
     * @mbg.generated
     */
    public String getDefaultModel() {
        return defaultModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.default_model
     *
     * @param defaultModel the value for freight_model.default_model
     *
     * @mbg.generated
     */
    public void setDefaultModel(String defaultModel) {
        this.defaultModel = defaultModel == null ? null : defaultModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.type
     *
     * @return the value of freight_model.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.type
     *
     * @param type the value for freight_model.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.unit
     *
     * @return the value of freight_model.unit
     *
     * @mbg.generated
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.unit
     *
     * @param unit the value for freight_model.unit
     *
     * @mbg.generated
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.gmt_create
     *
     * @return the value of freight_model.gmt_create
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.gmt_create
     *
     * @param gmtCreate the value for freight_model.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freight_model.gmt_modified
     *
     * @return the value of freight_model.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freight_model.gmt_modified
     *
     * @param gmtModified the value for freight_model.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}