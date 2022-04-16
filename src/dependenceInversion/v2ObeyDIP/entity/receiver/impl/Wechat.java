package dependenceInversion.v2ObeyDIP.entity.receiver.impl;

import dependenceInversion.v2ObeyDIP.entity.receiver.MsgMedium;

public class Wechat implements MsgMedium {
    @Override
    public String getInfo() {
        return "Hello, World! [P.S.This msg is from wechat.]";
    }
}
