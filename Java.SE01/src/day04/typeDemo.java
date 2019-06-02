package day04;

/**
 * 泛型
 * @author codingbear
 */

public class typeDemo<T> {

    private T x;

   public typeDemo(T x){

       this.x = x;
   }
   public T getX(){
       return x;
   }

   public void setX(){
        this.x = x;
   }

   public String toString(){
       return x+"";
   }

}
