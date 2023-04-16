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
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String city;
  private String street;
  private String zipcode;

  public Member(Long id, String name, String city, String street, String zipcode) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.street = street;
    this.zipcode = zipcode;
  }
}
