package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Color;
import java.awt.Point;
/**
 *
 * @author Rana Mostafa
 */
public class Hand 
{
    private Point SP;
    public final int width=15,heigth=15;
    public final Color color = Color.RED;

    public Hand() {}

    public Hand(Point SP) 
    {
        this.SP = SP;
    }

    public Point getSP() {
        return SP;
    }

    public void setSP(Point SP) {
        this.SP = SP;
    } 
}
