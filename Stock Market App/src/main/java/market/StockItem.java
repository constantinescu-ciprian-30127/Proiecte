package market;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import yahoofinance.Stock;


public class StockItem {
    
    @Getter @Setter
    private String symbol;
    @Getter @Setter
    private BigDecimal price;
    @Getter @Setter
    private BigDecimal change; 
    @Getter @Setter
    private String currency;    
    @Getter @Setter
    private String exchange;
    @Getter @Setter
    private String name;
    
    StockItem(Stock stock){
        price = stock.getQuote().getPrice();
        change = stock.getQuote().getChangeInPercent();
        symbol = stock.getSymbol();
        currency = stock.getCurrency();
        exchange = stock.getStockExchange();
        name = stock.getName();
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StockItem other = (StockItem) obj;
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }
    
    
    
}
