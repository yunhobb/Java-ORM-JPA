package com.example.chap04.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private int price;
  private int stockQuanity;

  public Item(Long id, String name, int price, int stockQuanity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.stockQuanity = stockQuanity;
  }
}
