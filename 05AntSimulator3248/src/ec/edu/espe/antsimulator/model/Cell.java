/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Cell {

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }
    private int row;
    private int col;
    
    public void recceivePheromone(PheromoneDrop pheromone){
        
    }
    
    public List <Ant> getAnts(){
        List ants =new ArrayList <>();
        return ants;
    }

}
