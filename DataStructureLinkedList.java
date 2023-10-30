import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.Iterator;  
import java.util.List;  
import java.util.ListIterator;  

public class DataStructureLinkedList {  
    public static void main(String[] args) {  
        //initiate an array with at least 5 elements
        Integer arrInt[] = {1,2,3,4,5};  
        //get array length using length function 
        int arrLen = arrInt.length;  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arrInt)); 
        arrayList.add(6);
        /*
        for(int i = 0; i<=arrLen; i++) {  
            System.out.println(arrayList.get(i)); 
        }
        */
        Iterator<Integer> listE = null; 
        listE = arrayList.listIterator();
        recur(listE);
    } 
    
    static void recur(Iterator<Integer> listE){
        while(listE.hasNext()){  
            System.out.println(listE.next());
            recur(listE);
        }   
    } }