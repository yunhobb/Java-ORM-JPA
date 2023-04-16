package com.example.chap04.entity;

import com.fasterxml.classmate.GenericType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class OrderItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long itemId;
  private Long orderId;
  private int orderPrice;
  private int count;

  public OrderItem(Long id, Long itemId, Long orderId, int orderPrice, int count) {
    this.id = id;
    this.itemId = itemId;
    this.orderId = orderId;
    this.orderPrice = orderPrice;
    this.count = count;
  }
}
