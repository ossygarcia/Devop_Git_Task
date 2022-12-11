/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstrproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Ehis
 */
class Node {

    private Node next, pre;

    private CustomerClass customer;

    public Node(Node next, Node pre, CustomerClass customer) {
        this.next = next;
        this.pre = pre;
        this.customer = customer;
    }

    public Node() {
        next = null;
        pre = null;
    }

    public Node getNext() {
        return next;
    }

    public Node getPre() {
        return pre;
    }

    public CustomerClass getCustomer() {
        return customer;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public void setCustomer(CustomerClass customer) {
        this.customer = customer;
    }

}

public class LinkList {

    Node head, tail;

    public LinkList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(CustomerClass customer) {
        Node node = new Node();
        node.setCustomer(customer);

        if (head == null || tail == null) {
            head = node;
            tail = node;
        } else {
            head.setNext(node);
            node.setPre(head);
            head = node;
        }

    }

    public CustomerClass getInfo(String ninNo) {
        Node temp = head;
        while (temp != null) {
            if (ninNo.equals(temp.getCustomer().getNinNo())) {
                return temp.getCustomer();
            }
            temp = temp.getPre();

        }
        return null;
    }

    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.getPre();
        }
        return size;
    }

    public String allData() {
        Node temp = head;
        String data = "";
        while (temp != null) {
            data += temp.getCustomer().toString() + "\n";
            temp = temp.getPre();
        }
        return data;
    }

    boolean check(String card) {
        Node temp = head;
        while (temp != null) {
            if (card.equals(temp.getCustomer().getCardNo())) {
                return true;
            }
            temp = temp.getPre();
        }
        return false;

    }

    boolean isExist(String text) {
        Node temp = head;
        while (temp != null) {
            if (text.equals(temp.getCustomer().getNinNo())) {
                return true;
            }
            temp = temp.getPre();
        }
        return false;
    }

    String accountInfo(String text) {
        Node temp = head;
        while (temp != null) {
            if (text.equals(temp.getCustomer().getNinNo())) {

                return "\nNinNo                   =" + temp.getCustomer().getNinNo()
                        + "\nAccountNo                   =" + temp.getCustomer().getAccountNo()
                        + "\nName                     =" + temp.getCustomer().getName()
                        + "\nCardNo                   =" + temp.getCustomer().getCardNo()
                        + "\nBalance                  =" + temp.getCustomer().getBalance()
                        + "\nPin                      =" + temp.getCustomer().getPin();
            }
            temp = temp.getPre();
        }
        return "";
    }

    String Deposit(double amount, String text) {
        Node temp = head;
        while (temp != null) {
            if (text.equals(temp.getCustomer().getNinNo())) {
                temp.getCustomer().deposit(amount);
                return "";
            }
            temp = temp.getPre();
        }
        return "";
    }

    void Withdraw(CustomerClass customer) {
        Node temp = head;

        while (temp != null) {
            if (customer.getNinNo().equals(temp.getCustomer().getNinNo())) {
                temp.setCustomer(customer);
                break;
            }
            temp = temp.getPre();
        }

    }

    CustomerClass checkCardPin(String text, String text1) {
        Node temp = head;
        while (temp != null) {
            if (text.equals(temp.getCustomer().getPin() + "") && text1.equals(temp.getCustomer().getCardNo())) {
                temp.getCustomer();
            }
            temp.getPre();
        }
        return null;
    }
}
