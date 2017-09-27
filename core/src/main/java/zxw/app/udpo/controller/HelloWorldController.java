package zxw.app.udpo.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: HelloWorldController
 * @description:
 * @author: zhangxw
 * @date: 2017/9/26 20:59
 * @params:
 * @returns
 */
@RestController
@RequestMapping("/hello_world")
public class HelloWorldController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Object helloWorld() {
        ApiResult result = new ApiResult();
        return result;
    }

}
