package zxw.app.udpo.core.mapper.first;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zxw.app.udpo.core.entity.Dictionary;

/**
 * @title: DictionaryMapper
 * @description:
 * @author: zhangxw
 * @date: 2017/9/27 10:30
 * @params:
 * @returns
 */
@Mapper
public interface DictionaryMapper1 {

    @Select("select * from dictionary where code = #{code}")
    Dictionary findByCode(Integer code);

    @Select("select count(*) from dictionary")
    Integer count();


}
