package dependenceInversion.v2ObeyDIP.entity.receiver.impl;

import dependenceInversion.v2ObeyDIP.entity.receiver.MsgMedium;

public class Email implements MsgMedium {

    @Override
    public String getInfo() {
        return "Hello, World! [P.S.This msg is from email.]";
    }

}
