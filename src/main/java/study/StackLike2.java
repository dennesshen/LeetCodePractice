package study;

public class StackLike2<T> {

    private Link<T> link;
    
    public void push(T x) {
        Link newLink = new Link<>(x);
        if (this.link != null) newLink.setNext(this.link);
        this.link = newLink;
    }

    public T pop() {
        T result = link.getValue();
        this.link = this.link.getNext();
        return result;
    }

    //index 從 0 開始
    public T get(int x){

        Link<T> cursor = this.link;
        int target = size() - x - 1;

        for (int i=0;;i++){
            if(cursor==null) throw new IndexOutOfBoundsException();
            if(i==target) return cursor.getValue();
            cursor = cursor.getNext();
        }
    }

    public T bottom(){
        return get(0);
    }

    public int size(){
        Link cursor = this.link;
        for (int i=0;;i++){
            if(cursor==null) return i;
            cursor = cursor.getNext();
        }
    }


    private class Link<T>{

        public Link(T value){
            this.value = value;
        }

        private T value;
        private Link<T> next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Link<T> getNext() {
            return next;
        }

        public void setNext(Link<T> next) {
            this.next = next;
        }
    }
    
    

}
