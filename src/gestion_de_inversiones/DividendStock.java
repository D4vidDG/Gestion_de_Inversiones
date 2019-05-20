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
public class DividendStock extends Stock {
    private double dividends;
    @Override
    public double getMarketValue(){
        return (this.total_shares*this.current_price)+this.dividends;
    }

    public DividendStock(double dividends, int total_shares, String symbol, double total_cost, double current_price) {
        super(total_shares, symbol, total_cost, current_price);
        this.dividends = dividends;
    }
    
    
}
