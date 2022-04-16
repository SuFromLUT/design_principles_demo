package dependenceInversion.v2ObeyDIP;

import dependenceInversion.v2ObeyDIP.entity.Person;
import dependenceInversion.v2ObeyDIP.entity.receiver.impl.Email;
import dependenceInversion.v2ObeyDIP.entity.receiver.impl.QQ;
import dependenceInversion.v2ObeyDIP.entity.receiver.impl.Wechat;

public class DIPDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.receiveMsg(new QQ());
        p.receiveMsg(new Wechat());
        p.receiveMsg(new Email());
    }
}
