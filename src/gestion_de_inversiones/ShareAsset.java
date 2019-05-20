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
public abstract class ShareAsset implements Asset {
  protected String symbol;
  protected double total_cost;
  protected double current_price;  
    
    @Override
    public double getProfit() {
        return 
    }
  @Override
    public abstract double getMarketValue();

    public ShareAsset(String symbol, double total_cost, double current_price) {
        this.symbol = symbol;
        this.total_cost = total_cost;
        this.current_price = current_price;
    }
    
    
}
