package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.Collections;

public class ChamandoFuncaoKotlin {
    public static void main(String[] args){
        ArrayList<String> list = CollectionsKt.arrayListOf("jao", "maria","pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
