package List;

public class ListElement {
    private final int value;
    private ListElement next;
    
    //Конструктор
    public ListElement(int value){
        this.value = value;
    }
    
    //Получить значение элемента
    public int getValue(){
        return value;
    }
    
    //Получить следующий элемент
    public ListElement getNext(){
        return next;
    }
    
    //Задать значение элемента
    public void setNext(ListElement next){
        this.next = next;
    }
}
