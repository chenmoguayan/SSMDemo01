package org.qingqiao.bean;

import lombok.Data;

/**
 * @author hj
 * @data 2023/2/16 17:46
 */
@Data
public class Car {
    private Integer id;
    private String name;
    private String brand;
    private String date;
    private String engine;
    private Integer horsepower;
    private Double price;
}
