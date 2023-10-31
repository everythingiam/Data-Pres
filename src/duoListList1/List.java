package duoListList1;
import org.w3c.dom.html.HTMLParagraphElement;
import postcard.Postcard;
import exception.MyException;

public class List {
    private PostcardObject head;
    private PostcardObject tail;

    //Возвращает позицию после последнего
    public Position getEndL() {
        return new Position(null);
    }

    //Вставляет элемент х в позицию pos
    public void insert(Postcard x, Position pos){
        //вставка в пустой список:
//        1. если голова пустая, то
//                2. создаем объект головы
//                3. голову приравниваем к хвосту

        //вставка в голову:
//        1. если позиция - это голова, то
//            2. во временную переменную пихаем объект головы
//                3. если элемент один (голова = хвост), то 4, если на один то 5.
//                4. хвост = временная переменная
//            5. голова = временные данные
//            6. следующий за временной = следующий за головой
//                7. помещаем в объект головы объект х
//                8. потом предыдущий за временной присваем значение головы
//                9. и присваиваем следующем за головой значчение временной переменной

        //вставка в середину
//        1. проверяем наличие позиции в списке. если да, то
//                2. временно фиксируем (tmp) объект карточки в этой позиции
//                3. ссылка на след после tmp у нас есть след позиция
//                4. а ссылка на предыдущий за tmp это теперь просто позиция
//                5. поэтому объект из позиции становится х
//                6. не знаю

        //вставка в конец
//        1. если позиция - это хвост, то
//            2. во временную tmp пихаем объект карточки в хвосте
//        3. слеюдующий за хвостом - tmp
//                4. данные в хвосте - х
//                5. tmp.prev теперь содержит ссылку на хвост
//                6. а хвост - есть tmp

        //вставка в позицию после последнего
//        1. если позиция не имеет данных, то
//                2. создаем временный элемент списка tmp из х
//                3. его предыдущий ссылается на хвост
//                4. следующий от хвоста теперь tmp
//                5. и сам хвост тоже tmp
    }

    public boolean isInList(PostcardObject postcard){
//        1. текущий делаем головой
//                2. в цикле пока  не дошли до конца сравниваем postcard с текущим
//                3. и сдвигаем текущий вперед
//                4. нашли - возвращаем тру
        return false;

    }

    public Position locate(Postcard x){
//        1. Пройтись по всем списку (через цикл, пока текущий не опустошится)
//        2. Если встретился объект х - вернуть позицию (сравнение через метод isEqual)
//            3. если нет - вернуть null
        return null;
    }

    public Postcard retrieve (Position pos){
//        1. если есть позиция, то вернуть объект из нее
//                2. если ее нет - выбросить исключение
        throw new MyException("position is out of bounds");
    }

    public Position delete (Position pos){
//        1.Если позиции нет, вернуть объект из параметров
//
//                удаление из головы
//        1. если позиция голова, то
//                2. если позивия еще и хвост, то удаляем единственный элемент (зануляем их)
//        3. голова = голова.next
//            4. предудщий за головой = null
//                5. вернуть позицию головы

//        удаление с конца
//                1. если позиция это хвост, то
//                2. хвосту присваем ссылку на следующий
//                3. а сылка на следующий null
//                4. вернуть null

//        если не существует
//                если позиции нет, то вернуть ее

//          в остальном варианте сдвигаем назад на шажок и вощвращаем
                return new Position(pos.p.prev);
    }
    //Возвращает следующую за pos позицию
    public Position next (Position pos){
//        1. если позиция есть, и
//                2. если она еще и хвост, то вернуть пощицию в null
//            3. иначе вернуть следующую позицию

        throw new MyException("position out of bounds");
    }

    public Position getPrevious(Position pos){
//        1. если позивия есть, и
//                2. если предыдущая за ней не null, то вернуть предыдущую позицию
        throw new MyException("Position is out of bounds");
    }

    //делает список пустым
    public void makeNull(){
        this.head = null;
        this.tail = null;
    }

    //Возвращает первую позицию
    public Position first(){
        return new Position(this.head);
    }

    public void print(){
//        1. создаем текущий и присваем ему голову
//                2. в цикле пока текущий не онуллился
//                3. выводим построчно
//                4. текущий теперь следующий
    }
    public boolean arePosEqual(Position a, Position b){
        return a.p == b.p;
    }
}
