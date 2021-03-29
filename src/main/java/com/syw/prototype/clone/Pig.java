package com.syw.prototype.clone;

import java.util.Date;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-18 13:31
 * @since JDK 1.8
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深克隆
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
