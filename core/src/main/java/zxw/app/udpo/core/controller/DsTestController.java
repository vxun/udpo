package zxw.app.udpo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import zxw.app.udpo.core.service.impl.DsTestServiceImpl;

/**
 * @title: DsTestController
 * @description:
 * @author: zhangxw
 * @date: 2017/9/27 16:09
 * @params:
 * @returns
 */
@RestController
@RequestMapping("/ds_test")
public class DsTestController {

    @Autowired
    DsTestServiceImpl dsTestService;

    @RequestMapping(value = "/f")
    @ResponseBody
    public Object testDs1() {
        ApiResult apiResult = new ApiResult();
        apiResult.setData(this.dsTestService.test1());
        return apiResult;
    }

    @RequestMapping(value = "/s")
    @ResponseBody
    public Object testDss() {
        ApiResult apiResult = new ApiResult();
        apiResult.setData(this.dsTestService.test2());
        return apiResult;
    }

}
