package zxw.app.udpo.core.configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

import static zxw.app.udpo.core.configure.SDsConfiguration.SQLSESSION_FACTORY;

/**
 * @title: SDsConfiguration
 * @description:
 * @author: zhangxw
 * @date: 2017/9/27 20:15
 * @params:
 * @returns
 */
@Configuration
@MapperScan(basePackages = "zxw.app.udpo.core.mapper.second", sqlSessionFactoryRef = SQLSESSION_FACTORY)
public class SDsConfiguration {


    public static final String DATA_SOURCE = "sds";

    public static final String TRANSCATION_MANAGER = "stm";

    public static final String SQLSESSION_FACTORY = "ssf";

    @Bean(name = DATA_SOURCE)
    @ConfigurationProperties(prefix = "datasource.second")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = TRANSCATION_MANAGER)
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier(DATA_SOURCE) DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }

    @Bean(name = SQLSESSION_FACTORY)
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE) DataSource ds) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);
        return bean.getObject();
    }

}
