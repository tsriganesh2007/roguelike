package io.github.tsriganesh2007.roguelike;

import io.github.tsriganesh2007.roguelike.world.Grid;
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        Grid g=new Grid(0, 0);
        System.out.println(g.tileAt(1, 1));
        
    }
}