package dependenceInversion.v1ViolateDIP.entity;

import dependenceInversion.v1ViolateDIP.entity.msgMedium.Email;
import dependenceInversion.v1ViolateDIP.entity.msgMedium.Wechat;

public class Person {

    public void receiveMsgFromEmail(Email email) {
        System.out.println(email.getInfo());
    }
    public void receiveMsgFromWechat(Wechat wechat) {
        System.out.println(wechat.getInfo());
    }
}
