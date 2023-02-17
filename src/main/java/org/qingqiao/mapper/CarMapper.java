package org.qingqiao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qingqiao.bean.Car;

import java.util.List;

/**
 * @author hj
 * @data 2023/2/16 17:50
 */
@Mapper
public interface CarMapper {
    List<Car> query();

    int insert(Car car);

    int update(Car car);

    int delete(int id);

    Car queryById(int id);
}
