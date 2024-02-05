package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Stock {
    private String name;
    private String address;
    private ArrayList<Invoice> invoiceList;

    public Stock(String name, String address) {
        this.name = name;
        this.address = address;
        this.invoiceList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void addInvoiceToList(Invoice invoice) {
        invoiceList.add(invoice);
    }

    public Set<String> getAllItemsName() {
        Set<String> allItemsName = new TreeSet<>();
        for (Invoice invoice : getInvoiceList()) {
            List<Item> items = invoice.getItems();
            for (int i = 0; i < items.size(); i++) {
                allItemsName.add(items.get(i).getItemName());
            }
        }
        return allItemsName;
    }
    public void printAllItemsName(){
        for (String itemName : getAllItemsName()) {
            System.out.println(itemName);
        }
    }

    public ArrayList<String> outerSenders(){
        ArrayList<String> result = new ArrayList<>();
        for (Invoice invoice : getInvoiceList()) {
            if("Outer".equals(invoice.getFromType())){
                result.add(invoice.getFrom());
            }
        }
        return result;
    }

    public void printOuterSenders(){
        for (String outerSender : outerSenders()) {
            System.out.println(outerSender);
        }
    }

    public ArrayList<Item> getItemByName(String itemName){
        ArrayList<Item> result = new ArrayList<>();
        for (Invoice invoice : getInvoiceList()) {
            for (Item item : invoice.getItems()) {
                String name = item.getItemName();
                if(itemName.equals(name)){
                    result.add(item);
                }
            }

        }
        return result;
    }

    public void printFoundItemByNameList(String itemName){
        for (Item item : getItemByName(itemName)) {
            System.out.println(item);
        }
    }
}
