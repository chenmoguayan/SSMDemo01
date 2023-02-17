package org.qingqiao.service;

import org.qingqiao.bean.Car;
import org.qingqiao.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hj
 * @data 2023/2/16 17:51
 */
@Service
public class CarServiceImpl implements CarService {

    private final CarMapper carMapper;

    public CarServiceImpl(CarMapper carMapper){
        this.carMapper = carMapper;
    }

    @Override
    public List<Car> query() {
        return carMapper.query();
    }

    @Override
    public Integer insert(Car car) {
        return carMapper.insert(car);
    }

    @Override
    public int update(Car car) {
        return carMapper.update(car);
    }

    @Override
    public int delete(int id) {
        return carMapper.delete(id);
    }

    @Override
    public Car queryById(int id) {
        return carMapper.queryById(id);
    }
}
