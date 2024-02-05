package task2;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String data;
    private String from;
    private String fromType;

    private String to;

    private String base;
    private String proxy;
    private ArrayList<Item> items;

    private String send;
    private String get;

    public Invoice(String data, String from, String fromType, String to, String base, String proxy, ArrayList<Item> items) {
        this.data = data;
        this.from = from;
        this.fromType = fromType;
        this.to = to;
        this.base = base;
        this.proxy = proxy;
        this.items = items;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }
}
