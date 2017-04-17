package org.xujin.sc.zuul.consumer.model;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author xujin
 *
 */
@Data
public class OrderModel {
	private Long orderNo;
	private Date createTime;
	private Date payTime;
}
