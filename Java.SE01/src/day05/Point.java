package day05;

import java.util.Objects;

/**
 *
 * 重写equals方法时应当重写hashCode方法
 *
 * 规则:
 *     两个对象equals 方法比较结果为true，那么hashCode返回的数字必须相同
 * 但反之则不是必须的，但是也应当避免，即: 两个对象若equals 方法比较结果为false，他们的hashCode方法返回值尽量不同。否则影响HashMap性能，
 * hashCode方法在当钱对象没变动的情况下返回值应当是相同的数字。
 *
 *@author codingbear
 *
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
