package hw3.lesson3;

import hw3.lesson3.drugs.Component;
import hw3.lesson3.drugs.impl.CatDrug;
import hw3.lesson3.drugs.impl.components.Azitron;
import hw3.lesson3.drugs.impl.components.Pinecilin;
import hw3.lesson3.drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug(componentsCat);
        for (Component component : drug) {
            System.out.println(component);
        }
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Pinecilin("Пинецилин", "18", 108));
        List<Component> componentCat3 = List.of(new Water("Вода", "2090", 12),
                new Azitron("Азитрон из России", "10", 100));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон из Вьетнамских трущоб", "10", 100));
        CatDrug drug1 = new CatDrug(componentCat2);
        CatDrug drug2 = new CatDrug(componentCat3);
        CatDrug drug4 = new CatDrug(componentCat4);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
//        System.out.println(drugs);
        Collections.sort(drugs);
        System.out.println(drugs);

/*
        Set<Component> uniqComponents = new HashSet<>(Arrays.asList(
                new Azitron("Azitron", "10", 5)
                , new Azitron("Azitron", "10", 5)
                , new Pinecilin("Pinecillin", "0.2", 2)
                , new Pinecilin("Pinecillin", "0.2", 2)));

        CatDrug setDrugs = new CatDrug(uniqComponents);
        System.out.println(setDrugs);*/
    }
}
