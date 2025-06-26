package com.algo.file;

import com.algo.list.ListChain;

public class File<T> {
    private ListChain<T> file;

    public File() {
        file = new ListChain<>(true);
    }
    public T queue() {
        return file.at(file.getSize());
    }
    public T debut() {
        return file.at(1);
    }
    public void enfiler(T val) {
        file.add_begin(val);
    }
    public void defiler() {
        file.delete_end();
    }
    public int get_size() {
        return file.getSize();
    }
    public String toString() {
        return ""; //faire avec l'itérateur
    }


}
