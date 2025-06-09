package teste_array_list;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Fiat");
        carros.add("Volvo");
        carros.add("Vw");
        carros.add("Chevrolet");
        for (String i : carros)
            System.out.println(i);
            System.out.println(carros.size());

        }
}