package zxw.app.udpo.core.configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @title: FDsConfigure
 * @description:
 * @author: zhangxw
 * @date: 2017/9/27 20:01
 * @params:
 * @returns
 */
@Configuration
@MapperScan(basePackages = "zxw.app.udpo.core.mapper.first")
public class FDsConfiguration {

    public static final String DATA_SOURCE = "fds";

    public static final String TRANSCATION_MANAGER = "ftm";

    public static final String SQLSESSION_FACTORY = "fsf";

    @Bean(name = DATA_SOURCE)
    @ConfigurationProperties(prefix = "datasource.first")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = TRANSCATION_MANAGER)
    @Primary
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier(DATA_SOURCE) DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }

    @Bean(name = SQLSESSION_FACTORY)
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier(DATA_SOURCE) DataSource ds) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);
        return bean.getObject();
    }


}
