package xyz.rimon.ael.domains;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SAyEM on 3/11/17.
 */

public abstract class Event implements Serializable{
    protected int id;
    protected String name;
    protected String code;
    protected Type type;
    protected String tag;
    protected byte rating;
    protected Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public enum Type{
        USER_EVENT,APP_EVENT,ERROR_EVENT;
    }

}
