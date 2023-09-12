import java.util.ArrayList;

class Bag<T>{
    // int size;
    Object items[];

    Bag(int size){
        // this.size = size;
        // items = new T[size];
        items =  new Object[size];
    }

    T getItems(){
        return (T)this.items;
    }
}
