function finalPrices(prices: number[]): number[] {
    for(let i = 0; i < prices.length; i++) {
        let j = i + 1;
        while(j < prices.length && prices[j] > prices[i]) j++;
        if(prices[j] <= prices[i]) prices[i] -= prices[j];
    }

    return prices;
};