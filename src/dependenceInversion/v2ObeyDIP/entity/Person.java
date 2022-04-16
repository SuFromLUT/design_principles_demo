package dependenceInversion.v2ObeyDIP.entity;

import dependenceInversion.v2ObeyDIP.entity.receiver.MsgMedium;

public class Person {
    public void receiveMsg(MsgMedium medium) {
        System.out.println(medium.getInfo());
    }
}
