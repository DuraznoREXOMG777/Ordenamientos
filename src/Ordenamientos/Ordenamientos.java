/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;

/**
 *
 * @author Yue
 */
public class Ordenamientos<Item>{

    public Comparable[] insertionSort(Comparable a[]){
        Item item;
        int i;
        for (int j = 1; j < a.length; j++) {
            item =(Item) a[j];
            i=j-1;
            while(i>=0 && a[i].compareTo(item)>=0){
                a[i+1]=a[i];
                i--;
            }
            a[i+1]=(Comparable) item;
        }
        return a;
    }
    
    public void insertionSortInverso(Comparable a[]){
        int i;
        Item item;
        for (int j = 1; j < a.length; j++) {
            item= (Item) a[j];
            i=j-1;
            while(i>=0 && a[i].compareTo(item)<0){
                a[i+1]=a[i];
                i--;
            }
            a[i+1]=(Comparable) item;
        }
    }
    
    public Comparable[] selectionSort(Comparable array[]){
        Item item,tmp;
        int i;
        for (int j = 0; j < array.length; j++) {
            i=j;
            for (int k = j+1; k < array.length; k++) {
                if(array[i].compareTo(array[k])>0){
                    i=k;
                }
            }
            if(i!=j){
                tmp=(Item)array[i];
                array[i]=array[j];
                array[j]=(Comparable) tmp;
            }
        }
        return array;
    }
    
    public Comparable[] selectionSortInvertido(Comparable array[]){
        Item item,tmp;
        int i;
        for (int j = 0; j < array.length; j++) {
            i=j;
            for (int k = j+1; k < array.length; k++) {
                if(array[i].compareTo(array[k])>0){
                    i=k;
                }
            }
            if(i!=j){
                tmp=(Item)array[i];
                array[i]=array[j];
                array[j]=(Comparable) tmp;
            }
        }
        return array;
    }
    
    public Comparable[] bubbleSort(Comparable array[]){
        Comparable tmp;
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j <= array.length-i; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=(Comparable)tmp;
                }
            }
        }
        return array;
    }
    
    public Comparable[] shellSort(Comparable[] array){
        int gap=5;
        Comparable tmp;
        while(gap>0){
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j>=gap && array[j].compareTo(array[j-gap])<0; j-=gap) {
                    tmp=array[j];
                    array[j]=array[j-gap];
                    array[j-gap]=   tmp;
                }
            }
            gap/=2;
        }
        return array;
    }
    
     public Comparable[] bubbleSortInvertido(Comparable array[]){
        Item tmp;
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j <= array.length-i; j++) {
                if(array[j].compareTo(array[j+1])<0){
                    tmp=(Item) array[j];
                    array[j]=array[j+1];
                    array[j+1]=(Comparable)tmp;
                }
            }
        }
        return array;
    }
     
    public Comparable[] quickSort(Comparable[] array, int inf, int sup){
        int i,j,p;
        i=inf;
        j=sup;
        if(inf>=sup)
            return array;
        while(i!=j){
            
        }
        return array;
    }
    
    public static void main(String[] args) {
        Ordenamientos ss=new Ordenamientos<Integer>();
        Integer[] in={5,1,2,10,2,4,3,3};
        in=(Integer[]) ss.shellSort(in);
        for (Integer in1 : in) {
            System.out.println(in1);
        }
    }
}
