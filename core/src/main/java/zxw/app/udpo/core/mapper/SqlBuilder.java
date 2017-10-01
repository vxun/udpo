package zxw.app.udpo.core.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * @title: SqlBuilder
 * @description:
 * @author: zhangxw
 * @date: 2017/9/27 14:07
 * @params:
 * @returns
 */
public class SqlBuilder {

    // With conditionals (note the final parameters, required for the anonymous inner class to access them)
    public static String selectPersonLike(final String id, final String firstName, final String lastName) {
        return new SQL() {{
            SELECT("P.ID, P.USERNAME, P.PASSWORD, P.FIRST_NAME, P.LAST_NAME");
            FROM("PERSON P");
            if (id != null) {
                WHERE("P.ID like #{id}");
            }
            if (firstName != null) {
                WHERE("P.FIRST_NAME like #{firstName}");
            }
            if (lastName != null) {
                WHERE("P.LAST_NAME like #{lastName}");
            }
            ORDER_BY("P.LAST_NAME");
        }}.toString();
    }

    public static void main(String[] args) {
        String s = selectPersonLike("id", "firstName", "lastName");
        System.out.println(s);
    }

}
