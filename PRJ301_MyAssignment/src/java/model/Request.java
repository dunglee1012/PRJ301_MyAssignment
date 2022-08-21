/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author leeng
 */
public class Request {

    private int id;
    private String content;
    private Date from;
    private Date to;
    private Account createdby;

    public Request() {
    }

    public Request(int id, String content, Date from, Date to, Account createdby) {
        this.id = id;
        this.content = content;
        this.from = from;
        this.to = to;
        this.createdby = createdby;
    }

    public Account getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Account createdby) {
        this.createdby = createdby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", content=" + content + ", from=" + from + ", to=" + to + ", createdby=" + createdby + '}';
    }

}
