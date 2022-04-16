package dependenceInversion.v1ViolateDIP;

import dependenceInversion.v1ViolateDIP.entity.msgMedium.Email;
import dependenceInversion.v1ViolateDIP.entity.Person;
import dependenceInversion.v1ViolateDIP.entity.msgMedium.Wechat;

public class DIPDemo1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receiveMsgFromEmail(new Email());
        person.receiveMsgFromWechat(new Wechat());
    }
}
