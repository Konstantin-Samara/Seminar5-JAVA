import java.util.LinkedHashMap;
import java.util.Map.Entry;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с 
// количеством повторений. Отсортировать по убыванию популярности.
public class task2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> Sort_List = new LinkedHashMap<>();
        String[] Persons = {"Иван Иванов","Светлана Петрова","Кристина Белова","Кристина Белова","Анна Мусина",
        "Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова",
        "Марина Светлова","Мария Савина","Иван Иванов","Петр Чернышов","Мария Рыкова","Марина Лугова","Анна Владимирова",
        "Иван Мечников","Петр Петин","Иван Иванов","Иван Ежов","Кристина Белова","Кристина Белова"};
        int Pos = 0;
        for (int j = 0; j < Persons.length; j++) {
            int Count = 1;
            for (int i = Pos; i < (Persons.length-1); i++) {
                if (Persons[Pos].equals(Persons[i+1])) Count++;}
            if ((Count>1)&&(!map1.containsKey(Persons[Pos]))) map1.put(Persons[Pos], Count);
            Pos++;}
        System.out.println("Список повторяющихся имен с кол-вом повторений(не отсортированный) :");
        System.out.println(map1);

        while (map1.size()>0){
            int max_val =1;
            String max_key = "";
            for (Entry<String, Integer> val : map1.entrySet()) {
                if (val.getValue()>max_val) {max_val = val.getValue(); max_key = val.getKey();}}           
            Sort_List.put(max_key, max_val);
            map1.remove(max_key);}
        System.out.println("Список повторяющихся имен с кол-вом повторений(отсортированный) :");
        System.out.println(Sort_List);
    }
    
}
