package day03;


public class Cell implements Comparable<Cell>{
    int x;
    int y;

    public Cell(int x,int y){
        this.x= x;
        this.y= y;

    }

    public String toString(){

        return "( "+x+","+y+" )";
    }

    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }
        if (obj == null){
            return  false;
        }
        if ( obj instanceof Cell ){
            Cell c = (Cell) obj;
            return this.x == c.x && this.y == c.y;
        }

        return false;

    }

    /**
     * f返回值不关注具体的值，只关注取值范围
     * 返回值<0 :当前的对象比给定的对象小
     * 返回值=0 :两个对象相等
     * 返回值>0 :当前的对象比给定的对象大
     * @param o
     * @return
     */

    public int compareTo(Cell o){

        return this.y - o.y;
    }

}


