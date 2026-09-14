package io.github.tsriganesh2007.roguelike.world;

public class Grid implements Renderable,Printable{
    private int width;
    private int height;
    private final char[][] tiles;
    public Grid(int width,int height){
        this.width=width;
        this.height=height;
        this.tiles=new char[height][width];

    }
    //new change

    //inteface implementation

    @Override
    public int getWidth(){
        return width;
    }

    @Override 
    public int getHeight(){
        return height;
    }
    @Override 
    public char tileAt(int x,int y){

        return tiles[x][y];
    }

    @Override 
    public String toText(){
        return "";
    }
}