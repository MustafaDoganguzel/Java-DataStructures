package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {

    public boolean add(String str) {
        if (!super.contains(str)) {
            return super.add(str);
        }
        return false;
    }

    public void sort(){
        Collections.sort(this);
    }

    public boolean remove(Object obj) {
        boolean result = super.remove(obj);
        return result;
    }
}
