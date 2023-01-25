package com.dreamTank.oopHomework;

  class point {
    private double x;
    private double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}

class Labeledpoint extends  point{
    private String simple;

    public Labeledpoint(double x, double y, String simple) {
        super(x, y);
        this.simple = simple;
    }
}
