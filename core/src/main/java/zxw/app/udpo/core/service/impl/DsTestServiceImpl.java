package zxw.app.udpo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zxw.app.udpo.core.mapper.first.DictionaryMapper1;
import zxw.app.udpo.core.mapper.second.DictionaryMapper2;
import zxw.app.udpo.core.service.DsTestService;

/**
 * @title: DsTestServiceImpl
 * @description:
 * @author: zhangxw
 * @date: 2017/9/27 16:42
 * @params:
 * @returns
 */
@Service
public class DsTestServiceImpl implements DsTestService{

    @Autowired
    private DictionaryMapper1 dictionaryMapper1;

    @Autowired
    private DictionaryMapper2 dictionaryMapper2;

    @Override
    public Integer test1() {
        return dictionaryMapper1.count();
    }

    @Override
    public Integer test2() {
        return dictionaryMapper2.count();
    }
}
