package config;

public enum DbConfig {
    INSTANCE;
    private final static String url = "jdbc:mysql://localhost/car?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Warsaw";
    private final static String url2 = "jdbc:mysql://localhost/car?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Warsaw";
    private final static String url3 = "jdbc:mysql://localhost/car?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Warsaw";
    private final static String login = "root";
    private final static String password = "root";

    public String getUrl() {
        return url;
    }

    public String getUrl2() {
        return url2;
    }

    public String getUrl3() {
        return url3;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


}