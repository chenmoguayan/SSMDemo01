package org.qingqiao.service;

import org.qingqiao.bean.Car;

import java.util.List;

/**
 * @author hj
 * @data 2023/2/16 17:51
 */
public interface CarService {
    List<Car> query();

    Integer insert(Car car);

    int update(Car id);

    int delete(int id);

    Car queryById(int id);
}
