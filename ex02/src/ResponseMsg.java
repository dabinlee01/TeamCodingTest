public class ResponseMsg {
    private int code;
    private String msg;

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public ResponseMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }


}
