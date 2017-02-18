package org.xujin.sc.eureka.first.order.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author xujin
 *
 */
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter
	@Getter
	private Long orderId;

	@Column
	@Setter
	@Getter
	private Date createTime;

	@Column
	@Setter
	@Getter
	private Date payTime;

}
