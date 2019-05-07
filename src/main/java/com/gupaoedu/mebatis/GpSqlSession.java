package com.gupaoedu.mebatis;


public class GpSqlSession {
    private GpConfigruation configruation;
    private GpExecutor executor;

    public GpSqlSession(GpConfigruation configruation, GpExecutor executor) {
        this.configruation = configruation;
        this.executor = executor;
    }

    /**
     * 获取一个代理对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz){
        return  configruation.getMapper(clazz,this);
    }

    /**
     *
     * @param statementId
     * @param paramter
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statementId,Object paramter) {
        String sql = GpConfigruation.resourceMapping.getString("com.gupaoedu.mebatis.BlogMapper.selectBlogById");
        return  executor.query(sql,paramter);

    }
}
