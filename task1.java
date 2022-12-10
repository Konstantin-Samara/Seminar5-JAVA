import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
public class task1 {
public static void main(String[] args) {
    LinkedHashMap<String,Integer> phones= new LinkedHashMap<>();
    LinkedHashMap<Integer,String> names= new LinkedHashMap<>();
    LinkedHashMap<Integer,String> sort_names= new LinkedHashMap<>();
    Scanner scan = new Scanner(System.in);
    String name = "";
    String phone = "";
    int key = 1;
    while (!name.equals("end")){
        System.out.print("Введите имя "+key+"-го сотрудника (\"end - завершить\"): ");
        name = scan.nextLine();
        if (!name.equals("end")) {
            names.put(key, name);
            int i=1;
            phone = "";
            while (!phone.equals("end")) {
                System.out.print("Для сотрудника ("+key+". "+name+") введите "+i+" номер телефона(\"end - завершить\"): ");
                phone = scan.nextLine();
                if (!phone.equals("end")) {phones.put(phone, key);i++;}}
            key++;}}
    scan.close();

    System.out.println("\nНесортированный список имен с уникальными ключами :");
    System.out.println(names);
    System.out.println("\nНесортированный список телефонов с вторичными ключами(по именам):");
    System.out.println(phones);
    while (names.size()>0){
        String min_val ="я";
        int min_key = 1;
        for (Entry<Integer, String> val : names.entrySet()) {
            if (val.getValue().charAt(0)<min_val.charAt(0)) 
                {min_val = val.getValue(); min_key = val.getKey();}}           
        sort_names.put(min_key,min_val);
        names.remove(min_key);}

    System.out.println("\nТелефонная книга отсортированная по первым буквам имени :");
    for (Entry<Integer, String> val : sort_names.entrySet()) {
        System.out.println(val.getValue());
        for (Entry<String, Integer> val1 : phones.entrySet()){
            if (val1.getValue()==val.getKey()) System.out.println(val1.getKey());}}
}
    
}