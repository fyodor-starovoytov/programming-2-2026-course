package net.star.java;

import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class HashTable<K, O> {
    private final ArrayList<TableElement<K, O>>[] table;

    public HashTable() {
        this.table = new ArrayList[10];
    }
    public HashTable(int size) {
        this.table = new ArrayList[size];
    }

    public void add(K key, O object){
        int hashedKey = hashedKey(key);
        TableElement<K, O> element = new TableElement<>(key, object);

        if (table[hashedKey] == null){
            table[hashedKey] = new ArrayList<>();
        }

        for (TableElement<K, O> e : table[hashedKey]){
            if (e.getKey().equals(key)){
                return;
            }
        }

        table[hashedKey].add(element);
    }

    public O get(K key){
        int hashedKey = hashedKey(key);
        if (table[hashedKey] == null){
            return null;
        }

        for (TableElement<K, O> e : table[hashedKey]){
            if (e.getKey().equals(key)){
                return e.getObject();
            }
        }

        return null;
    }

    public void remove(K key){
        int hashedKey = hashedKey(key);
        if (table[hashedKey] == null){
            return;
        }

        table[hashedKey].removeIf(e -> e.getKey().equals(key));

        return;
    }
    private int hashedKey(K key){
        return Math.abs(key.hashCode() % table.length);
    }
}

class TableElement<K, O> extends LinkedList<O> {
    private K key;
    private O object;

    public TableElement(K key, O object) {
        this.key = key;
        this.object = object;
    }

    public K getKey() {
        return key;
    }

    public O getObject() {
        return object;
    }

    @Override
    public String toString() {
        return key + " ; " + object;
    }
}

