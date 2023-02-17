package org.qingqiao.controller;

import com.alibaba.fastjson.JSON;
import org.qingqiao.bean.Car;
import org.qingqiao.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author hj
 * @data 2023/2/16 17:49
 */
@Controller
@RequestMapping("/car")
public class CarController {
//    构造函数更适合于强制依赖项和以不变性为目标的情况。对于可选的依赖项，setter更好。

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    private CarService carService;
//
//    public void setCarService(CarService carService) {
//        this.carService = carService;
//    }
//    为什么不推荐使用Field注入
//    违反单一责任原则,依赖隐藏,依赖注入容器耦合,不变性
//    @Autowired
//    private CarService carService;



    @RequestMapping("/query")
    public ModelAndView query(ModelAndView modelAndView){
        List<Car> list =  carService.query();
        modelAndView.setViewName("list");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public void insert(Car car,HttpServletResponse response) throws IOException {
        Integer i = carService.insert(car);
        response.getWriter().print(i > 0);
    }
    @RequestMapping("/update")
    @ResponseBody
    public void update(Car car, HttpServletResponse response) throws IOException {
        int i = carService.update(car);
        response.getWriter().print(i > 0);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(int id,HttpServletResponse response) throws IOException {
        int i = carService.delete(id);
        response.getWriter().print(i > 0);
    }
    @RequestMapping("/queryById")
    @ResponseBody
    public void queryById(int id,HttpServletResponse response) throws IOException {
        Car car = carService.queryById(id);
        String s = JSON.toJSONString(car);
        response.getWriter().print(s);
    }
}
