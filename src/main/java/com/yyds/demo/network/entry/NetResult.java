package com.yyds.demo.network.entry;

public class NetResult {

    private String rescode;
    private String resmsg;

    public NetResult(String rescode, String resmsg) {
        this.rescode = rescode;
        this.resmsg = resmsg;
    }

    public NetResult() {
    }

    public String getRescode() {
        return rescode;
    }

    public void setRescode(String rescode) {
        this.rescode = rescode;
    }

    public String getResmsg() {
        return resmsg;
    }

    public void setResmsg(String resmsg) {
        this.resmsg = resmsg;
    }
}
