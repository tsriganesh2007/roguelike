package io.github.tsriganesh2007.roguelike.world;

public interface Renderable {
    char tileAt(int x,int y);
    int getWidth();
    int getHeight();
}
