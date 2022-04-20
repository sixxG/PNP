package List;

public class ListUtils {
    
    //Вставка элемента в начало списка
    public static ListElement insert(ListElement first, int value){
        if(first == null) {
            return new ListElement(value);
        } else {
            ListElement p = new ListElement(value);
            p.setNext(first);
            return p;
        }
    }
    
    //Фильтрация списка, отбор элементов делящихся на 3
    public static ListElement filter(ListElement first){
        ListElement p = null;
        while (first != null){
            if(first.getValue()%3 == 0){
                p = insert(p, first.getValue());
            }
            first = first.getNext();
        }
        return p;
    }
    
    //Рекурсивное возведение элементов списка в куб
    public static ListElement map(ListElement first){
        if (first == null) {
            return null;
        }
        
        int value = first.getValue();
        return insert(map(first.getNext()), value*value*value);
    }
    
    //Вычисление суммы элементов списка
    public static int reduce(ListElement first){
        int sum = 0;
        while (first != null) {
            sum += first.getValue();
            first = first.getNext();
        }
        return sum;
    }
    
}
