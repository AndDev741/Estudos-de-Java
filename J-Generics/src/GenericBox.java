public class GenericBox <T> {
    private T data;

    public GenericBox(T t){
        this.data = t;
    }

    public T getData(){
        return data;
    }

    public void setData(T t){
        this.data = t;
    }

}
