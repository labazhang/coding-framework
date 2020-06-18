package me.jkong.mybatis.executor;

import me.jkong.mybatis.builder.MappedStatement;
import me.jkong.mybatis.session.Configuration;

import java.sql.SQLException;
import java.util.List;

/**
 * 定义SQL执行方法
 *
 * @author JKong
 */
public interface Executor {
    /**
     * 数据查询
     *
     * @param configuration 配置
     * @param mappedStatement
     * @param param
     * @param <E>
     * @return
     * @throws Exception
     */
    <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object[] param) throws Exception;

    void close() throws SQLException;
}