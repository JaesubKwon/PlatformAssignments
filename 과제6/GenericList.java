package edu.pnu.collection;
import edu.pnu.admin.*;
public class GenericList<T>{
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;
    public <T>GenericList(){
        data = new Object[DEFAULT_SIZE];
    }
    public <T>GenericList(int limit){
        data = new Object[limit];
    }
    public void setLimit(int limit){
        Object[] new_data = new Object[limit];
        for(int i=0; i<size; i++){
            new_data[i] = data[i];
        }
        data = new_data;
    }
    public void add(T target){
        data[size++] = target;
    }
    public void clear(){
        for(int i=0; i<size; i++){
            data[i] = null;
        }
        size = 0;
    }
    public T findData(T target){
        for(int i =0; i<size; i++){
            if(target.equals(data[i])) return (T)data[i];
        }
        return null;
    }
    public int getSize(){
        return size;
    }
    @Override
    public String toString(){
        String str = "";
        for(int i =0; i<size; i++){
            str += String.format("[%s]\n", data[i].toString());
        }
        return str;

    }
}
