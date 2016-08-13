package com.headfirst.designpattern.component;

import java.util.Iterator;

/**
 * Created by Naver on 2016-07-26.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
