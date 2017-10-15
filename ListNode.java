package com.company.generics.collection.strucure;

import java.util.List;

public class ListNode {
    int data;
    ListNode ListNext;


    public ListNode(int date){
        this.data=date;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getListNext() {
        return ListNext;
    }

    public void setListNext(ListNode listNext) {
        ListNext = listNext;
    }

    public int ListLength(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getListNext();
        }
        return length;
    }

    public ListNode insertListNode(ListNode headNode, ListNode nodeTointer,int postion){
        if(headNode==null)
            return nodeTointer;
        int size=ListLength(headNode);
        if(postion>size+1 || postion<1){
            System.out.println("value"+(size+1));
            return headNode;
        }
        if(postion==1){
            nodeTointer.setListNext(headNode);
            return nodeTointer;
        }else {
            ListNode previousNode=headNode;
            int count=1;
            while (count<postion-1){
                previousNode =previousNode.getListNext();
                count++;
            }
            ListNode currentNode=previousNode.getListNext();
            nodeTointer.setListNext(currentNode);
            previousNode.setListNext(nodeTointer);
        }
        return headNode;
    }
}
