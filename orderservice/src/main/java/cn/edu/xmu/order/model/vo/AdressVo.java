package cn.edu.xmu.order.model.vo;

import lombok.Data;

/**
 * @author 史韬韬
 * created in 2020/12/3
 */
@Data
public class AdressVo {
    private String consignee;
    private Long regionId;
    private String address;
    private String mobile;
}
