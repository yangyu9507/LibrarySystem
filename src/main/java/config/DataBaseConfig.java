package config;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-12-03
 * @description 数据库配置
 */
public class DataBaseConfig {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/library?&useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "123456";

}
