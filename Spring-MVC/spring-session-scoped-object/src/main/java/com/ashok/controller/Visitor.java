package com.ashok.controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Visitor implements Serializable {
	
    private final String ip;
    private final List<String> pageVisited = new ArrayList<>();

    public Visitor (String ip) {
        this.ip = ip;
    }

    public String getIp () {
        return ip;
    }

    public void addPageVisited (String page) {
        pageVisited.add(page);
    }

    public List<String> getPagesVisited () {
        return pageVisited;
    }
}