package com.young.ssm.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.springframework.util.StringUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther:dep
 * @Date: 2019/7/16 17:25
 * @Description: 自定义Mybatis 的类型处理器
 */
//该注解处理自定义处理的类型对应的jdbc的数据类型
@MappedJdbcTypes(JdbcType.VARCHAR)
public class DemoTypeHandler extends BaseTypeHandler<String> {
    /**
     * 设置参数
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i,parameter);
    }

    /**
     * 对于获取的结果进行null判断
     * @param rs
     * @param columnName
     * @return
     * @throws SQLException
     */
    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String result = rs.getString(columnName);
        return StringUtils.isEmpty(result) && rs.wasNull() ? null : result;
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String result = rs.getString(columnIndex);
        return StringUtils.isEmpty(result) && rs.wasNull() ? null : result;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String result = cs.getString(columnIndex);
        return StringUtils.isEmpty(result) && cs.wasNull() ? null : result;
    }
}
