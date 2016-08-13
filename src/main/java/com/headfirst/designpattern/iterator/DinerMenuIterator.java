package com.headfirst.designpattern.iterator;

import java.util.Iterator;

/**
 * Created by Naver on 2016-07-26.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if(position <= 0){
            throw new IllegalStateException("next()를 한 번도 호출 하지 않고, 삭제 할 수 없습니다.");
        }
        if(items[position - 1 ] != null){
            for (int i = position-1; i < (items.length -1); i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
