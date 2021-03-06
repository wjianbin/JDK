// Automatically generated by CodeGeneratorJava.pm. Do not edit.

package com.sun.webkit.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.html.HTMLElement;
import org.w3c.dom.html.HTMLOptionElement;

public class HTMLOptionsCollectionImpl extends HTMLCollectionImpl {
    HTMLOptionsCollectionImpl(long peer) {
        super(peer);
    }

    static HTMLOptionsCollectionImpl getImpl(long peer) {
        return (HTMLOptionsCollectionImpl)create(peer);
    }


//attributes
    public int getSelectedIndex() {
        return getSelectedIndexImpl(getPeer());
    }
    native static int getSelectedIndexImpl(long peer);

    public void setSelectedIndex(int value) {
        setSelectedIndexImpl(getPeer(), value);
    }
    native static void setSelectedIndexImpl(long peer, int value);

    public int getLength() {
        return getLengthImpl(getPeer());
    }
    native static int getLengthImpl(long peer);

    public void setLength(int value) throws DOMException {
        setLengthImpl(getPeer(), value);
    }
    native static void setLengthImpl(long peer, int value);


//functions
    public HTMLOptionElement namedItem(String name)
    {
        return HTMLOptionElementImpl.getImpl(namedItemImpl(getPeer()
            , name));
    }
    native static long namedItemImpl(long peer
        , String name);


    public void add(HTMLElement element
        , HTMLElement before) throws DOMException
    {
        addImpl(getPeer()
            , HTMLElementImpl.getPeer(element)
            , HTMLElementImpl.getPeer(before));
    }
    native static void addImpl(long peer
        , long element
        , long before);


    public void addEx(HTMLElement element
        , int index) throws DOMException
    {
        addExImpl(getPeer()
            , HTMLElementImpl.getPeer(element)
            , index);
    }
    native static void addExImpl(long peer
        , long element
        , int index);


}

