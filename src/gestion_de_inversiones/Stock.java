/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_inversiones;

/**
 *
 * @author jdiazga
 */
public class Stock extends ShareAsset {
    protected int total_shares;
    @Override
    public double getMarketValue(){
        return total_shares*this.current_price;
    }

    public Stock(int total_shares, String symbol, double total_cost, double current_price) {
        super(symbol, total_cost, current_price);
        this.total_shares = total_shares;
    }
    
    
}
