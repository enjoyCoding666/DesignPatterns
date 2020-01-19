package strategy.demo;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\1\16 0016 23:08
 * @Description:
 */
public enum UserTypeEnum {

    ORDINARY("1","code1"),
    SILVER_VIP("2","code2"),
    GOLD_VIP("3","code3"),
    PLATINUM_VIP("4","code4"),

    ;


    UserTypeEnum(String type, String code) {
        this.type = type;
        this.code = code;
    }

    private String type;
    private String code;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
